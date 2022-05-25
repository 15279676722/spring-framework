package com.example.yq.bean;

import org.springframework.stereotype.Component;

/**
 * @author yangqiang
 * @create 2022-05-24 20:17
 */
@Component
public class UserService {
	private String name;

	public UserService(String name) {
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
}
