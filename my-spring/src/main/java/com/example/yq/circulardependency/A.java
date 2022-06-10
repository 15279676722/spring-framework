package com.example.yq.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangqiang
 * @create 2022-06-10 19:22
 */
public class A {
	@Autowired
	private B b;


}
