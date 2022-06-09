package com.example.yq.lookup.annotation;

import org.springframework.beans.factory.annotation.Lookup;

/**
 * @author yangqiang
 * @create 2022-06-09 14:49
 */
public abstract class Fruit {
	// 和<lookup-method/> 作用是一样 的作用方法getFruit 注入bean fruit 一个是基于注解一个是基于xml方式
	@Lookup(value = "banana")
	Fruit getFruit(){
		return null;
	}

	public void type(){
		System.out.println("fruit");
	}

	public void print(){
		Fruit fruit = getFruit();
		fruit.type();
	}
}
