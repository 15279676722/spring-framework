package com.example.yq.aop;

import com.example.yq.aop.config.AspectJConfig;
import com.example.yq.aop.pointcut.Person;
import com.example.yq.aop.pointcut.StudentAutowireMode;
import com.example.yq.ioc.bean.UserService;
import com.example.yq.ioc.config.AnnotationConfig;
import com.example.yq.ioc.config.BeanConfig;
import com.example.yq.ioc.service.SetterBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2022-05-24 20:16
 */
public class AspectJTest {


	@Test
	public void AspectJAnnotation() {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AspectJConfig.class);
		Person bean2 = (Person) context.getBean("student");
		bean2.say();
	}

	@Test
	public void AspectJXml() {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("aop-spring.xml");

		StudentAutowireMode studentAutowireMode =(StudentAutowireMode) context.getBean(StudentAutowireMode.class);
		System.out.println(studentAutowireMode.toString());
		Person bean2 = (Person) context.getBean("student");
		bean2.say();
	}


}
