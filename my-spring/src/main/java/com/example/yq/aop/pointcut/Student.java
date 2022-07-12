package com.example.yq.aop.pointcut;


import com.example.yq.ioc.lookup.annotation.Apple;
import com.example.yq.ioc.lookup.annotation.Fruit;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

/**
 * @author yangqiang
 * @create 2022-06-13 16:54
 */
public class Student implements Person{

	private Fruit fruit;

	private Apple apple;

	@Override
	public void say() {
		System.out.println("这是一个苦逼的程序员");
		((Person) AopContext.currentProxy()).sayAfter();

	}

	@Override
	public void sayAfter() {
		System.out.println("这是一个苦逼的程序员sayAfter");
	}

	@Lookup(value = "banana")
	Fruit getFruit(){
		return null;
	}

	public Student() {

	}

	public Student(Fruit fruit) {
		this.fruit = fruit;
	}

	@Autowired
	public Student(Apple apple) {
		this.apple = apple;
	}


}
