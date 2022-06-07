package com.example.yq.multicaster.listener;

import com.example.yq.multicaster.event.MyApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	@Override
	public void onApplicationEvent(MyApplicationEvent event) {

		System.out.println("MyApplicationListener 收到消息: " + event.getMessage());

	}
}
