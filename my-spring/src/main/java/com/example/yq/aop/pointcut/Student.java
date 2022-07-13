package com.example.yq.aop.pointcut;


import com.example.yq.ioc.lookup.annotation.Apple;
import com.example.yq.ioc.lookup.annotation.Fruit;
import com.example.yq.ioc.propertyeditor.Content;
import com.example.yq.ioc.propertyeditor.Job;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

import java.beans.ConstructorProperties;

/**
 * @author yangqiang
 * @create 2022-06-13 16:54
 */
public class Student implements Person{

	private Fruit fruit;

	private Apple apple;

	private String name;

	private Long id;

	private Integer age;

	private Job job;

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


	//@Autowired
	public Student(Apple apple ,String name) {
		this.apple = apple;
	}

	/**
	 * @Autowired 只能作用于一个构造方法上面
	 * @ConstructorProperties({"name1","id1"})
	 *  定制xml和参数的映射 在xml中就可以配置name1 这个字段 并没有什么用不建议用
	 * */
    @Autowired
	@ConstructorProperties({"apple","name1","id1","age","job"})
	public Student(Apple apple, String name, Long id, Integer age, Job job) {
		this.apple = apple;
		this.name = name;
		this.id = id;
		this.age = age;
		this.job = job;
	}


}
