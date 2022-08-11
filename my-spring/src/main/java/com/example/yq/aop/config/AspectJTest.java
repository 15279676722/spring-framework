package com.example.yq.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.AspectJAfterAdvice;
import org.springframework.aop.aspectj.AspectJAfterThrowingAdvice;
import org.springframework.aop.aspectj.AspectJAroundAdvice;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.aop.interceptor.ExposeInvocationInterceptor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.interceptor.TransactionInterceptor;

/**
 * @see AfterReturning
 * @see AfterThrowing
 *
 * @see ExposeInvocationInterceptor
 * @see TransactionInterceptor
 * @see AspectJAroundAdvice
 * @see MethodBeforeAdviceInterceptor
 * @see AfterReturningAdviceInterceptor
 * @see AspectJAfterThrowingAdvice
 * @see AspectJAfterAdvice
 * @see AfterReturningAdviceInterceptor
 *
 * 整个AOP链执行顺序
 * 1.ExposeInvocationInterceptor 把当前AOP对象放到线程对象中 可以通过AopContext.currentProxy()得到
 * 2.TransactionInterceptor 事务拦截器 执行事务 操作并监控后续的AOP增强操作报错即使后面的AOP增强操作报错也随时可以回滚
 * 3.AspectJAroundAdvice  AOP的around操作  执行proceed()方法前的before操作
 * 4.MethodBeforeAdviceInterceptor  @Before 实现AOP前置操作
 * 5.执行被AOP增强的方法
 * 6.如果出现异常 执行@AfterThrowing 注解下的方法
 * 7.正常返回时 执行@AfterReturning 注解下的方法对返回值操作 但是不能修改
 * 8.AspectJAfterAdvice @After实现AOP后置操作
 * 9.AspectJAroundAdvice  AOP的around操作  执行proceed()方法后的after操作
 */
@Aspect
@EnableAspectJAutoProxy(exposeProxy = true)
public class AspectJTest {

	@Pointcut("execution(* com.example.yq.transaction.service.AccountService.accountBalance(..)) )")
	public void test() {
	}

	// 所有方法的执行作为切入点
	@AfterReturning(returning = "rvt"
			, pointcut = "execution(* com.example.yq.transaction.service.AccountService.accountBalance(..)) )")
	public void log(Object rvt) {
		System.out.println("获取目标方法返回值:" + rvt);
		System.out.println("模拟记录日志功能...");
	}

	@AfterThrowing(pointcut="execution(* com.example.yq.transaction.service.AccountService.accountBalance(..))", throwing= "error")
	public void afterThrowingAdvice(JoinPoint jp, Throwable error){
		System.out.println("Method Signature: "  + jp.getSignature());
		System.out.println("Exception: "+error);
	}



	@Before("test()")
	public void before() {
		System.out.println("before test..");
	}

	@After("test()")
	public void after() {
		System.out.println("after test..");
	}

	@Around("test()")
	public Object around(ProceedingJoinPoint p) {
		System.out.println("around before");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("around after");
		return o;
	}
}
