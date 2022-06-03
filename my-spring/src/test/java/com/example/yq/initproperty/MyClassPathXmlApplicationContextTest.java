package com.example.yq.initproperty;

import com.example.yq.bean.UserService;
import com.example.yq.config.FactoryBeanConfig;
import com.example.yq.factorybean.MyFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangqiang
 * @create 2022-05-29 01:27
 */
public class MyClassPathXmlApplicationContextTest{

	@Test
	public void testBean(){
		ApplicationContext context =
				new MyClassPathXmlApplicationContext("ioc-spring.xml");

	}
}
