package com.example.yq.aop.pointcut;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangqiang
 * @create 2022-06-13 16:54
 */
public class Student implements Person{
	@Override
	public void say() {
		System.out.println("这是一个苦逼的程序员");
	}

    @Autowired
	private StudentB studentB;
}
