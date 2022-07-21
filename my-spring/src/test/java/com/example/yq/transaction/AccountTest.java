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
    public void testAccount() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx.xml");
        AccountService accService = ctx.getBean("accountServiceImpl", AccountService.class);
        //从id为1的用户转账给id为2的用户500元
        accService.accountBalance(1, 2, 500);
    }

}
