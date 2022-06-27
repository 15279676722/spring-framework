package com.example.yq.aop.replaced;

/**
 * @author yangqiang
 * @create 2022-06-27 11:29
 */
public class ReplacedBean {
	private String name;
	private Integer age;

	public ReplacedBean(String name, Integer age ) {
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void test(String name, Integer age) {
		System.out.println(name + age);
	}
	public void test() {
		System.out.println("1122");
	}
}
