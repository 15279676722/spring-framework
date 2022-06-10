package com.example.yq.xml.lookup;

import com.example.yq.bean.UserService;
import com.example.yq.lookup.annotation.Fruit;
import com.example.yq.lookup.annotation.LookUpBean;
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
	public void LookUpBean(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ioc-spring-lookup.xml");
		Animal animal =(Animal) context.getBean("animal");
		animal.print();
	}


	@Test
	public void LookUpAnnotationBean(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("ioc-spring-lookup.xml");
		LookUpBean lookUpBean =(LookUpBean) context.getBean("lookUpBean");
		lookUpBean.print();
	}
}
