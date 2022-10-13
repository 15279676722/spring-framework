package com.example.yq.ioc.dependency.repository;

import com.example.yq.ioc.dependency.domain.User;

import java.util.List;

/**
 * 用户信息仓储
 * */
public class UserRepository {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "UserRepository{" +
				"users=" + users +
				'}';
	}
}
