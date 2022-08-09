package com.example.yq.transaction.service;


import java.io.IOException;

public interface AccountService {
	//实现转账的业务方法
	double accountBalance(int lessenId,int addId,double balance) throws IOException;
}
