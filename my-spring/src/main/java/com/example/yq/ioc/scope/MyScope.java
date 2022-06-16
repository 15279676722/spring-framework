package com.example.yq.ioc.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author yangqiang
 * @create 2022-06-16 19:41
 */
public class MyScope implements Scope {

	public static final String THREAD_SCOPE = "thread";//@1

	private ThreadLocal<Map<String, Object>> beanMap = new ThreadLocal() {
		@Override
		protected Object initialValue() {
			return new HashMap<>();
		}
	};
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		Object bean = beanMap.get().get(name);
		if (Objects.isNull(bean)) {
			bean = objectFactory.getObject();
			beanMap.get().put(name, bean);
		}
		return bean;
	}

	@Override
	public Object remove(String name) {
		return this.beanMap.get().remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		//bean作用域范围结束的时候调用的方法，用于bean清理
		System.out.println(name);
	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return Thread.currentThread().getName();
	}
}
