package com.example.yq.ioc.bean;


import org.springframework.beans.factory.InitializingBean;

/**
 * @create 2022-05-24 20:17
 */
public class UserService implements InitializingBean {
	private String name;

	public UserService(String name) {
		System.out.println("userService constructor");
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getUserName(){
		System.out.println(name);
	}

    public void initMethod(){
		System.out.println("userService init");
	}
	public void destroyMethod(){
		System.out.println("userService destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("UserService afterPropertiesSet");
	}

}
