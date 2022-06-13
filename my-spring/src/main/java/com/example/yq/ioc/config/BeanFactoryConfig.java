package com.example.yq.ioc.config;

import com.example.yq.ioc.beanfactory.MyBeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangqiang
 * @create 2022-05-27 00:01
 */
@Configuration
public class BeanFactoryConfig {
	@Bean
	public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
		return new MyBeanFactoryPostProcessor();
	}

}
