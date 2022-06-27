package com.example.yq.aop.pointcut;


import org.springframework.aop.framework.AopContext;

/**
 * @author yangqiang
 * @create 2022-06-13 16:54
 */
public class Student implements Person{
	@Override
	public void say() {
		System.out.println("这是一个苦逼的程序员");
		((Person) AopContext.currentProxy()).sayAfter();

	}

	@Override
	public void sayAfter() {
		System.out.println("这是一个苦逼的程序员sayAfter");
	}


}
