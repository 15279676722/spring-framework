package com.example.yq.aop.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LookUpBean {

    private BeanB beanB;




    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }


	public BeanB getBeanB() {
		return beanB;
	}

	public void print(){
		System.out.println("11111");
	}
}
