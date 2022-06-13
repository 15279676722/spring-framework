package com.example.yq.ioc.config;

import com.example.yq.ioc.bean.UserService;
import com.example.yq.ioc.factorybean.MyFactoryBean;
import com.example.yq.ioc.initbean.InitBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @create 2022-05-24 20:18
 */
@Configuration
public class FactoryBeanConfig {
	@Bean
	public MyFactoryBean myFactoryBean(){
		return new MyFactoryBean();
	}


}
