package com.example.yq.ioc.initproperty;

import com.example.yq.ioc.bean.UserService;
import com.example.yq.ioc.config.FactoryBeanConfig;
import com.example.yq.ioc.factorybean.MyFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

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
