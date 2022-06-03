package com.example.yq.xml.annotation;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * byName形式的注入还是可以得到的
 * @create 2022-05-24 20:16
 */
public class XmlAnnotationTest {

	@Test
	public void testBean(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ioc-spring2.xml");
		context.getBean("serviceB");
	}
}
