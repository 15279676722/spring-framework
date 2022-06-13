package com.example.yq.ioc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * 意义在于通过普通对象就可以获取到某些容器中存在的容器属性
 *
 * @author yangqiang
 * @create 2022-05-25 22:50
 */
public class AwareBean implements ApplicationContextAware, EnvironmentAware, BeanNameAware {
	private ApplicationContext applicationContext;
	private Environment environment;
	private String beanName;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Environment getEnvironment() {
		return environment;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}
