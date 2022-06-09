package com.example.yq.xml.lookup;

import com.example.yq.bean.UserService;
import com.example.yq.lookup.xml.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @create 2022-05-24 20:16
 */
public class LookUpTest {

	@Test
	public void testBean(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ioc-spring.xml");
		Animal animal =(Animal) context.getBean("animal");
		animal.print();
	}
}
