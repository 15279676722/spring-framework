package com.example.yq.ioc.lookup.xml;

/**
 * @author yangqiang
 * @create 2022-06-08 21:57
 */
public class Dog extends Animal{
	@Override
	public String eat() {
		System.out.println("狗吃猫");
		return "狗吃猫";
	}
}
