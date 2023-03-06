package com.example.yq.aop.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookUpTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        LookUpBean bean = context.getBean(LookUpBean.class);
		System.out.println(bean.getBeanB());
        BeanB bean1 = context.getBean(BeanB.class);


        System.out.println("-------------------");

    }
}
