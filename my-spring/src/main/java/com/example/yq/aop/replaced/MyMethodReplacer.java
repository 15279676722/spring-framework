package com.example.yq.aop.replaced;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * bean的方法替换
 * @author yangqiang
 * @create 2022-06-27 11:27
 */
public class MyMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("obj = " + obj + ", method = " + method + ", args = " + Arrays.deepToString(args));
		System.out.println("MyMethodReplacer.reimplement");
		return null;
	}
}
