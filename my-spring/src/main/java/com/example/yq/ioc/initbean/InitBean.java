package com.example.yq.ioc.initbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.util.Objects;

/**
 * 初始化bean的前后操作
 * <p>
 * postProcessBeforeInstantiation()
 * 调用构造方式进行实例化
 * postProcessAfterInstantiation()
 * postProcessProperties()
 * <p>
 * postProcessBeforeInitialization()
 * <p>
 * afterPropertiesSet()
 * <p>
 * init-method()
 * <p>
 * postProcessAfterInitialization()
 * <p>
 * destroy-method()
 * <p>
 * <p>
 * BeanPostProcessor 的前后置操作不对自身bean起作用 ！
 * TODO 不知道这样说合不合适后期看源码再分析
 *
 * @author yangqiang
 * @create 2022-05-25 23:03
 */
public class InitBean implements InitializingBean, InstantiationAwareBeanPostProcessor {


	private String name;

	public InitBean(String name) {
		this.name = name;
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (Objects.equals(beanName, "cat")) {
			System.out.println(beanName + "  对象实例化之前操作");
			System.out.println("InitBean.postProcessBeforeInstantiation");
		}
		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (Objects.equals(beanName, "cat")) {
			System.out.println(beanName + "  对象实例化之后操作");
			System.out.println("InitBean.postProcessAfterInstantiation");
		}
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}


	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		//pvs是在xml 配置的<property>标签的集合 在这里可以进行修改
		if (Objects.equals(beanName, "cat")) {

			System.out.println(beanName + " 对象实例化之后赋值操作");
			System.out.println("InitBean.postProcessProperties");
		}

		return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
	}


	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("initBean afterPropertiesSet");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (Objects.equals(beanName, "cat")) {

			System.out.println("beanName = " + beanName + "  Before");
			System.out.println("InitBean.postProcessBeforeInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (Objects.equals(beanName, "cat")) {

			System.out.println("beanName = " + beanName + "  After");
			System.out.println("InitBean.postProcessAfterInitialization");
		}
		return bean;
	}

	public void initMethod() {

		System.out.println("initBean init");
	}


	public void destroyMethod() {

		System.out.println("initBean destroy");

	}


}
