package com.example.yq.config;

import com.example.yq.aware.AwareBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @create 2022-05-24 20:18
 */
@Configuration
public class AwareBeanConfig {
	@Bean
	public AwareBean awareBean(){
		return new AwareBean();
	}


}
