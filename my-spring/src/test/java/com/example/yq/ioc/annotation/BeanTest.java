package com.example.yq.ioc.annotation;

import com.example.yq.ioc.service.SetterBean;
import com.example.yq.ioc.bean.UserService;
import com.example.yq.ioc.config.AnnotationConfig;
import com.example.yq.ioc.config.BeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @create 2022-05-24 20:16
 */
public class BeanTest {


	@Test
	public void testBean(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(BeanConfig.class);
		UserService userService = context.getBean(UserService.class);

		userService.getUserName();
	}

	@Test
	public void testAnnotation(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AnnotationConfig.class);
		SetterBean myService = context.getBean(SetterBean.class);

	}

}
