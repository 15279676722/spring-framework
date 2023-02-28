package com.example.yq.aop;

import com.example.yq.aop.config.AspectJConfig;
import com.example.yq.aop.pointcut.Person;
import com.example.yq.aop.pointcut.StudentAutowireMode;
import com.example.yq.aop.simple.MyAOPBean;
import com.example.yq.aop.simple.SimpleAspectJConfig;
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
		context.getBean("myFactoryBean");
		System.out.println(bean2);
		bean2.say();
	}
	@Test
	public void AspectJSimple() {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SimpleAspectJConfig.class);


		MyAOPBean bean2 = (MyAOPBean) context.getBean("myAOPBean");
		System.out.println(bean2);
		bean2.say("yangq");
	}

}
