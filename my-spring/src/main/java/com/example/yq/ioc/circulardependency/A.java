package com.example.yq.ioc.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangqiang
 * @create 2022-06-10 19:22
 */
public class A {
	@Autowired
	private B b;
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
