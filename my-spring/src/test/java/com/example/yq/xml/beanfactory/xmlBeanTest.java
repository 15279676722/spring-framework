package com.example.yq.xml.beanfactory;

import com.example.yq.bean.UserService;
import com.example.yq.config.BeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @create 2022-05-24 20:16
 */
public class xmlBeanTest {

	@Test
	public void testBean(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ioc-spring.xml");
		UserService userService = context.getBean(UserService.class);

		userService.getUserName();
	}
}
