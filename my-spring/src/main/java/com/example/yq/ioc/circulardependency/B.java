package com.example.yq.ioc.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangqiang
 * @create 2022-06-10 19:22
 */
public class B {
	@Autowired
	private A a;
}
