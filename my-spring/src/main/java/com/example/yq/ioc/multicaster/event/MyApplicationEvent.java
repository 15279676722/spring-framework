package com.example.yq.ioc.multicaster.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author yangqiang
 * @create 2022-06-07 15:54
 */
public class MyApplicationEvent extends ApplicationEvent {
	private String message;

	public MyApplicationEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
