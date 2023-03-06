//package com.example.yq.simpletest;
//
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class AspectJConfig {
//    @Pointcut("execution(public void com.example.yq.simpletest.BeanA.*(..))") // 匹配 Join Point
//    public void aspectJ(){
//        System.out.println("@Pointcut at any public method.");
//    }
//
//    @Before("aspectJ()")
//    public void before(){
//        System.out.println("before");
//    }
//
//	@Before("aspectJ()")
//	public void before2(){
//		System.out.println("before2");
//	}
//
//    @After("aspectJ()")
//    public void after(){
//        System.out.println("after");
//    }
//}
