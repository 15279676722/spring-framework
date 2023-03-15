package com.example.yq.ioc.initproperty;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Map;
import java.util.Properties;

public class MyAnnotationConfigApplicationContext extends AnnotationConfigApplicationContext {
    public MyAnnotationConfigApplicationContext(Class<?>... componentClasses) {
        super(componentClasses);
    }

	@Override
	protected void initPropertySources() {
		System.out.println("initPropertySources扩展  -------可以对系统环境变量进行修改,以及加入校验");
		ConfigurableEnvironment environment = getEnvironment();
		MutablePropertySources propertySources = environment.getPropertySources();
		// 获得系统属性
		Map<String, Object> systemProperties = environment.getSystemProperties();
		// 获取系统环境变量
		Map<String, Object> systemEnvironment = environment.getSystemEnvironment();

        // 新增一套环境变量
		Properties properties = new Properties();
		properties.put("name","smallwhite");
		PropertiesPropertySource propertySource = new PropertiesPropertySource("smalwhite",properties);
		propertySources.addLast(propertySource);

        //设置 要校验的属性 必须存在 name这个key
		environment.setRequiredProperties("name");

	}

}
