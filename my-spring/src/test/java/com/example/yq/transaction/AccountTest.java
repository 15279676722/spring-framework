package com.example.yq.transaction;

/**
 * @author yangqiang
 * @create 2022-07-20 17:57
 */

import com.example.yq.transaction.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {


    @Test
    public void testAccountXml() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx.xml");
        AccountService accService = ctx.getBean("accountServiceImpl", AccountService.class);
        //从id为1的用户转账给id为2的用户500元
        accService.accountBalance(1, 2, 500);
    }

	@Test
	public void testAccountAnnotation() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx-anno.xml");
		AccountService accService = ctx.getBean("accountServiceAnnoImpl", AccountService.class);
		//从id为1的用户转账给id为2的用户500元
		accService.accountBalance(1, 2, 500);
	}

	@Test
	public void testAccountProgram() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx-anno.xml");
		AccountService accService = ctx.getBean("accountServiceProgramImpl", AccountService.class);
		//从id为1的用户转账给id为2的用户500元
		accService.accountBalance(1, 2, 500);
	}

	@Test
	public void testAccountProgram2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx-anno.xml");
		AccountService accService = ctx.getBean("accountServiceProgram2Impl", AccountService.class);
		//从id为1的用户转账给id为2的用户500元
		accService.accountBalance(1, 2, 500);
	}




}
