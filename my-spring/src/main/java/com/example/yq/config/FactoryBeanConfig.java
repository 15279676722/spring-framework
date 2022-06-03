package com.example.yq.config;

import com.example.yq.bean.UserService;
import com.example.yq.factorybean.MyFactoryBean;
import com.example.yq.initbean.InitBean;
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
