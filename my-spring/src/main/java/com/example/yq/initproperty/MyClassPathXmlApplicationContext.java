package com.example.yq.initproperty;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangqiang
 * @create 2022-05-29 01:27
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String ...configLocations){
		super(configLocations);
	}
	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySource");
		//设置需要验证的属性 当前环境属性中没有的话会报错
//		getEnvironment().setRequiredProperties("abc");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
