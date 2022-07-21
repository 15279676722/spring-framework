package com.example.yq.aop.simple;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @see AfterReturning
 * @see AfterThrowing
 * 有时间研究这两个的作用
 * */
@Aspect
public class AspectJTest {

	@Pointcut("execution(public String com.example.yq.aop.simple.MyAOPBean.say(..)) )")
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
