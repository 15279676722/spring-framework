package com.example.yq.initbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 初始化bean的前后操作
 * InitBean constructor
 * BeanPostProcessor Before
 * InitBean afterPropertiesSet
 * InitBean init
 * BeanPostProcessor After
 *
 * BeanPostProcessor 的前后置操作不对自身bean起作用 ！
 * TODO 不知道这样说合不合适后期看源码再分析
 * @author yangqiang
 * @create 2022-05-25 23:03
 */
public class InitBean implements InitializingBean, BeanPostProcessor {


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor Before");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor After");
		return bean;
	}

	public void initMethod(){
		System.out.println("initBean init");
	}
	public void destroyMethod(){
		System.out.println("initBean destroy");
	}
}
