package com.example.yq.config;

import com.example.yq.bean.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangqiang
 * @create 2022-05-24 20:18
 */
@Configuration
public class BeanConfig {
	@Bean
	public UserService userService(){
		return new UserService("yangqiang");
	}
}
