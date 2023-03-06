package com.example.yq.aop.lookup;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectJTest2 {

	@Pointcut("execution(public void com.example.yq.aop.lookup.LookUpBean.print(..))")
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
