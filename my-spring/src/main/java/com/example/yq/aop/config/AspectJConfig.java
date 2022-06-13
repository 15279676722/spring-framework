package com.example.yq.aop.config;

import com.example.yq.aop.pointcut.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yangqiang
 * @create 2022-06-13 16:57
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectJConfig {
	@Bean
	public AspectJTest aspectJTest(){
		return new AspectJTest();
	}

	@Bean
	public Student student(){
		return new Student();
	}
}
