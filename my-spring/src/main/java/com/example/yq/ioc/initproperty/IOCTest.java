package com.example.yq.ioc.initproperty;


public class IOCTest {
    public static void main(String[] args) {
        MyAnnotationConfigApplicationContext context = new MyAnnotationConfigApplicationContext(AnnotationConfig.class);
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }
}
