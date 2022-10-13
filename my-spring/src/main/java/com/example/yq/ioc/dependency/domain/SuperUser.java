package com.example.yq.ioc.dependency.domain;

import com.example.yq.ioc.dependency.annotation.Super;

@Super
public class SuperUser extends User{
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SuperUser{" +
				"address='" + address + '\'' +
				"} " + super.toString();
	}
}
