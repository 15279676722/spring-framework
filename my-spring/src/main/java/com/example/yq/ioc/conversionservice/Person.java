package com.example.yq.ioc.conversionservice;

/**
 * @author yangqiang
 * @create 2022-06-30 16:47
 */
public class Person {
	private Integer age;
	private String name;

	public Person(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
