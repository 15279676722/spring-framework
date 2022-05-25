package com.example.yq.annotation;

import com.example.yq.bean.UserService;
import com.example.yq.config.BeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangqiang
 * @create 2022-05-24 20:16
 */
public class BeanTest {

//	@Autowired
//	private UserService userService;
	@Test
	public void testBean(){
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(BeanConfig.class);
		UserService userService = context.getBean(UserService.class);

		userService.getUserName();
	}
}
