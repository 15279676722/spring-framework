package com.example.yq.ioc.dependency.injection;

import com.example.yq.ioc.dependency.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 */
public class InjectionDemo {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("dependency-injection-context.xml");
		UserRepository userRepository = beanFactory.getBean(UserRepository.class);
		System.out.println(userRepository);
	}
}
