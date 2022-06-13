package com.example.yq.ioc.factorybean;

import com.example.yq.ioc.bean.UserService;
import org.springframework.beans.factory.FactoryBean;

/**
 * UserService 这个bean不会在IOC容器初始化的时候创建完
 * 而是在使用的时候通过getObject()方法得到
 * @author yangqiang
 * @create 2022-05-26 00:15
 */
public class MyFactoryBean implements FactoryBean<UserService> {
	@Override
	public UserService getObject() throws Exception {
		return new UserService("yangqiang");
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
