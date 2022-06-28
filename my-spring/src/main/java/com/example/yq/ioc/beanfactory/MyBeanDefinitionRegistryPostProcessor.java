package com.example.yq.ioc.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

import java.util.Arrays;

/**
 *
 * @author yangqiang
 * @create 2022-06-28 10:48
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("beanDefinition数量"+registry.getBeanDefinitionCount());
		System.out.println("所有beanDefinition名称"+ Arrays.stream(registry.getBeanDefinitionNames()).toList());

		System.out.println("手动注册bean cat2");
		BeanDefinition cat = registry.getBeanDefinition("cat");
		registry.registerBeanDefinition("cat2",cat);
	}
}
