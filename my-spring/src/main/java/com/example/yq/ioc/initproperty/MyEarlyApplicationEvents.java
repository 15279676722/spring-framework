package com.example.yq.ioc.initproperty;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEarlyApplicationEvents implements BeanDefinitionRegistryPostProcessor, ApplicationContextAware{

	ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		 this.applicationEventPublisher = (ApplicationEventPublisher)applicationContext;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		applicationEventPublisher.publishEvent("1");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("11");
	}
}
