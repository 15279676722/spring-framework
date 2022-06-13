package com.example.yq.ioc.config;

import com.example.yq.ioc.circulardependency.A;
import com.example.yq.ioc.circulardependency.B;
import com.example.yq.ioc.initbean.InitBean;
import com.example.yq.ioc.multicaster.listener.MyRefreshedListener;
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

	@Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
	public InitBean initBean(){
		return new InitBean("yangqiang");
	}

	@Bean
	public MyRefreshedListener myRefreshedListener(){
		return new MyRefreshedListener();
	}
}
