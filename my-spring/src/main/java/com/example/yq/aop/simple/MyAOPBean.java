package com.example.yq.aop.simple;

/**
 * @author yangqiang
 * @create 2022-07-21 17:56
 */
public class MyAOPBean {

	public String say(String name) {
		System.out.println(name);
		return name;
	}
}
