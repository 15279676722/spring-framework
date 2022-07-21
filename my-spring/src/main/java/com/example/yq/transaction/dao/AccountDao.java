package com.example.yq.transaction.dao;

public interface AccountDao {
	//减少余额
	void lessenBalance(int id,double balance);
	//增加余额
	void addBalance(int id,double balance);
}
