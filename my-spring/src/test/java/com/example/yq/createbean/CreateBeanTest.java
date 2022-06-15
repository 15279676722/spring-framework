package com.example.yq.createbean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 4中创建bean对象的方式
 * @author yangqiang
 * @create 2022-06-14 19:50
 */
public class CreateBeanTest {
	@Test
	public void ConstructorTest(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans_constructor.xml");
		System.out.println("spring容器中所有bean如下：");
		//getBeanDefinitionNames用于获取容器中所有bean的名称
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName + ":" + context.getBean(beanName));
		}
	}

	@Test
	public void StaticFactoryTest(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans_static_factory.xml");
		System.out.println("spring容器中所有bean如下：");
		//getBeanDefinitionNames用于获取容器中所有bean的名称
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName + ":" + context.getBean(beanName));
		}
	}

	@Test
	public void ExampleFactoryTest(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans_static_factory.xml");
		System.out.println("spring容器中所有bean如下：");
		//getBeanDefinitionNames用于获取容器中所有bean的名称
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName + ":" + context.getBean(beanName));
		}
	}

	@Test
	public void FactoryBeanTest(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("factory_bean.xml");
		System.out.println("spring容器中所有bean如下：");
		//getBeanDefinitionNames用于获取容器中所有bean的名称
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName + ":" + context.getBean(beanName));
		}

		System.out.println("--------------------------");
		//多次获取createByFactoryBean看看是否是同一个对象
		System.out.println("createByFactoryBean:" + context.getBean("createByFactoryBean"));
		System.out.println("createByFactoryBean:" + context.getBean("createByFactoryBean"));
	}
}
