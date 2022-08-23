package com.example.yq.ioc.scope;

import org.springframework.context.annotation.Scope;

public class BeanScopeModel {
    public BeanScopeModel(String beanScope) {
        System.out.println(String.format("线程:%s,create BeanScopeModel,{sope=%s},{this=%s}", Thread.currentThread(), beanScope, this));
    }
}
