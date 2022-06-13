package com.example.yq.ioc.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * 扩展BeanDefinition信息
 * @create 2022-05-25 16:57
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor  , Ordered {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 获取指定的beanDefinition，这里操作bean定义的属性是最合适不过的
		BeanDefinition personDefinition = beanFactory.getBeanDefinition("myBeanFactoryPostProcessor");
		System.out.println(personDefinition);
		// 这里建议不要调用getBean来获取某个类的实例进行一些操作，因为这里get的话，他可能还没有进行属性赋值

	}

	@Override
	public int getOrder() {
		return 1;
	}
}
