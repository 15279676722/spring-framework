package com.example.yq.ioc.lookup.annotation;

import com.example.yq.ioc.initbean.InitBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;

/**
 * @author yangqiang
 * @create 2022-06-10 11:01
 */
public class LookUpBean {
	private String name;
	private Integer Id;
	// 和<lookup-method/> 作用是一样 的作用方法getFruit 注入bean fruit 一个是基于注解一个是基于xml方式
	@Lookup(value = "banana")
	Fruit getFruit(){
		return null;
	}


	public void print(){
		Fruit fruit = getFruit();
		fruit.type();
	}


	public LookUpBean() {
	}

	public LookUpBean(String name, Integer id) {
		this.name = name;
		Id = id;
	}
}
