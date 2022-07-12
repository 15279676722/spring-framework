package com.example.yq.aop.config;

import com.example.yq.aop.pointcut.Student;
import com.example.yq.aop.pointcut.StudentB;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;

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
	@Lazy
	public StudentB studentB(){
		return new StudentB();
	}

	@Bean
	public LazyInitTargetSourceCreator lazyInitTargetSourceCreator(){
		return new LazyInitTargetSourceCreator();
	}

//	@Bean
//	public AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator(LazyInitTargetSourceCreator lazyInitTargetSourceCreator){
//		AnnotationAwareAspectJAutoProxyCreator annotationAwareAspectJAutoProxyCreator = new AnnotationAwareAspectJAutoProxyCreator();
//		annotationAwareAspectJAutoProxyCreator.setCustomTargetSourceCreators(lazyInitTargetSourceCreator);
//		return annotationAwareAspectJAutoProxyCreator;
//	}
}
