package com.example.yq.lookup.annotation;

import org.springframework.beans.factory.annotation.Lookup;

/**
 * @author yangqiang
 * @create 2022-06-09 14:49
 */
public abstract class Fruit {
	@Lookup
	abstract void type();
}
