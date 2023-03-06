package com.example.yq.simpletest;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        BeanA bean = context.getBean(BeanA.class);
        bean.test();
    }
}
