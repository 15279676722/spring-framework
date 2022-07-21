package com.example.yq.aop.simple;

import com.example.yq.aop.config.AspectJTest2;
import com.example.yq.aop.config.LazyInitTargetSourceCreator;
import com.example.yq.aop.pointcut.Student;
import com.example.yq.aop.pointcut.StudentAutowireMode;
import com.example.yq.aop.pointcut.StudentB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yangqiang
 * @create 2022-06-13 16:57
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class SimpleAspectJConfig {
	@Bean
	public AspectJTest aspectJTest(){
		return new AspectJTest();
	}

	@Bean
	public MyAOPBean myAOPBean(){
		return new MyAOPBean();
	}


}
