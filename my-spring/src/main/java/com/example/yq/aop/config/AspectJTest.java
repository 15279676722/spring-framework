package com.example.yq.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @see AfterReturning
 * @see AfterThrowing
 * 有时间研究这两个的作用
 * */
@Aspect
@EnableAspectJAutoProxy(exposeProxy = true)
public class AspectJTest {

	@Pointcut("execution(* com.example.yq.transaction.service.AccountService.accountBalance(..)) )")
	public void test(){}

	@Before("test()")
	public void before(){
		System.out.println("before test..");
	}

	@After("test()")
	public void after(){
		System.out.println("after test..");
	}

	@Around("test()")
	public Object around(ProceedingJoinPoint p){
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
