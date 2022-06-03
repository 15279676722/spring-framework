package com.example.yq.config;

import com.example.yq.bean.UserService;
import com.example.yq.beanfactory.MyBeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @create 2022-05-24 20:18
 */
@Configuration
public class BeanConfig {
	@Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
	public UserService userService(){
		return new UserService("libai");
	}

	@Bean
	public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
		return new MyBeanFactoryPostProcessor();
	}
}
