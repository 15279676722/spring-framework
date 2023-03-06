package com.example.yq.simpletest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
@Component
public class MyInterceptor implements MethodInterceptor {
	@Nullable
	@Override
	public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
		System.out.println("MyInterceptor.invoke");
		return invocation.proceed();
	}
}
