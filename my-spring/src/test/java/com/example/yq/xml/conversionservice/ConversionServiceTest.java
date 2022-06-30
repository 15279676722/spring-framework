package com.example.yq.xml.conversionservice;

import com.example.yq.ioc.conversionservice.MyClass;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangqiang
 * @create 2022-06-30 16:56
 */
public class ConversionServiceTest {

	@Test
	public void testBean(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ioc-conversionservice.xml");
		context.getBean("myClass", MyClass.class);
	}
}
