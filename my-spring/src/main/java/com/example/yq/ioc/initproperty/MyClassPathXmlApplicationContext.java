package com.example.yq.ioc.initproperty;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Map;

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
		System.out.println("扩展initPropertySource--------可以对系统环境变量进行修改 以及加入校验");
		ConfigurableEnvironment environment = getEnvironment();
		Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
		Map<String, Object> systemProperties = environment.getSystemProperties();
		//往系统属性中加入值
		//可使用参数占位符
		systemProperties.put("name","smallWhite");
		//设置需要验证的属性 当前环境属性中没有的话会报错
		environment.setRequiredProperties("name");
		System.out.println(systemEnvironment);
		System.out.println(systemProperties);

	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
