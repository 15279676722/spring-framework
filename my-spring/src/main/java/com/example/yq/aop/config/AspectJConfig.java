package com.example.yq.aop.config;

import com.example.yq.aop.pointcut.Student;
import com.example.yq.aop.pointcut.StudentAutowireMode;
import com.example.yq.aop.pointcut.StudentB;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.*;

/**
 * @author yangqiang
 * @create 2022-06-13 16:57
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class AspectJConfig {
	@Bean
	public AspectJTest aspectJTest(){
		return new AspectJTest();
	}
	@Bean
	public AspectJTest2 aspectJTest2(){
		return new AspectJTest2();
	}

	@Bean
	public Student student(){
		return new Student();
	}

	@Bean
	public StudentB studentB(){
		return new StudentB();
	}

	@Bean
	public StudentAutowireMode studentAutowireMode(){
		return new StudentAutowireMode();
	}

	@Bean
	public LazyInitTargetSourceCreator lazyInitTargetSourceCreator(){
		return new LazyInitTargetSourceCreator();
	}

}
