package com.example.yq.aop.lookup;


import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy(exposeProxy = true)
public class AnnotationConfig {
    @Bean
    public LazyInitTargetSourceCreator lazyInitTargetSourceCreator(){
        return new LazyInitTargetSourceCreator();
    }




//    @Bean
//    public BeanNameAutoProxyCreator nameAutoProxyCreator(){
//        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//        beanNameAutoProxyCreator.setBeanNames("lookUpBean");
//        beanNameAutoProxyCreator.setInterceptorNames("extendsInterceptor");
//        return beanNameAutoProxyCreator;
//    }

}
