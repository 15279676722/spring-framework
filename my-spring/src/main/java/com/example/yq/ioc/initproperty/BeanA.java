package com.example.yq.ioc.initproperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private BeanB beanB;

	private BeanC beanc;


	@Autowired(required = false)
	public BeanA( BeanB beanB) {
		this.beanB = beanB;
	}
	@Autowired(required = false)
	public BeanA(BeanC beanc) {
		this.beanc = beanc;
	}
}
