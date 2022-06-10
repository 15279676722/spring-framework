package com.example.yq.config;

import com.example.yq.bean.UserService;
import com.example.yq.initbean.InitBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @create 2022-05-24 20:18
 */
@Configuration
public class InitBeanConfig {
	@Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
	public InitBean initBean(){
		return new InitBean("yangqiang");
	}

	@Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
	public UserService userService(){
		return new UserService("libai");
	}
}
