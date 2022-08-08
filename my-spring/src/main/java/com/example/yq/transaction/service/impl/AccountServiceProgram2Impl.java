package com.example.yq.transaction.service.impl;


import com.example.yq.transaction.dao.AccountDao;
import com.example.yq.transaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 编程式事务管理
 */
@Service
public class AccountServiceProgram2Impl implements AccountService {
	@Autowired
	AccountDao accountDao;
	@Autowired
	private PlatformTransactionManager platformTransactionManager;

	@Override
	public void accountBalance(int lessenId, int addId, double balance) {
		TransactionStatus transaction = platformTransactionManager.getTransaction(new DefaultTransactionDefinition());


		//某个账号减少金额
		accountDao.lessenBalance(lessenId, balance);

		//走个账号增加金额
		accountDao.addBalance(addId, balance);

		//模拟出现异常
		int a = 5 / 0;

		platformTransactionManager.commit(transaction);
	}


}
