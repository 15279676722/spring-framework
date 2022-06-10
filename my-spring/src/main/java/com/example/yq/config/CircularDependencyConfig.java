package com.example.yq.config;

import com.example.yq.circulardependency.A;
import com.example.yq.circulardependency.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangqiang
 * @create 2022-06-10 19:38
 */
@Configuration
public class CircularDependencyConfig {
	@Bean
	public A a() {
		return new A();
	}

	@Bean
	public B b() {
		return new B();
	}
}
