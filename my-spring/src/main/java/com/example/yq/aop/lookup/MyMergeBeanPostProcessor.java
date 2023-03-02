package com.example.yq.aop.lookup;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.util.Objects;

@Component
public class MyMergeBeanPostProcessor implements MergedBeanDefinitionPostProcessor, SmartInstantiationAwareBeanPostProcessor, PriorityOrdered {

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        print(beanName);
        return null;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        print(beanName);

        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        print(beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
    }

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        print(beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        print(beanName);
        return MergedBeanDefinitionPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        print(beanName);
        return MergedBeanDefinitionPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        print(beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        print(beanName);
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        print(beanName);
        return SmartInstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }


    public static void print(String beanName,int level) {
        if (Objects.equals(beanName, "lookUpBean")|| Objects.equals(beanName, "")) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[level];
            System.out.println(stackTraceElement.getMethodName());
        }
    }

    public static void print(String beanName) {
        print(beanName,3);
    }

    public static void print() {
        print("",3);
    }

    @Override
    public int getOrder() {
        return 1 ;
    }


}
