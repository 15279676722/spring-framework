package com.example.yq.aop.lookup;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class ExtendsInterceptor implements MethodInterceptor {



    public ExtendsInterceptor() {

    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("yangqiang");
        return methodInvocation.proceed();
    }
}
