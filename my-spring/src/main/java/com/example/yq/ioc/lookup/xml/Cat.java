package com.example.yq.ioc.lookup.xml;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author yangqiang
 * @create 2022-06-08 21:57
 */
public class Cat extends Animal implements InitializingBean {
	@Override
	public String eat() {
		System.out.println("猫吃老鼠");
		return "猫吃老鼠";
	}

	public void initMethod(){
		System.out.println("cat init");
	}
	public void destroyMethod(){
		System.out.println("cat destroy");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("cat afterPropertiesSet");
	}
	public Cat() {
		System.out.println("cat 实例化");
	}
}
