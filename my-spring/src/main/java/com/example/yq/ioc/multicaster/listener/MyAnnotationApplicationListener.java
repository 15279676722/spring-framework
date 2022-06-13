package com.example.yq.ioc.multicaster.listener;

import com.example.yq.ioc.multicaster.event.MyApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotationApplicationListener {

 @EventListener(classes = MyApplicationEvent.class)
 public void myApplicationEventListener(MyApplicationEvent event) {

  System.out.println("使用注解的方式, 收到事件: " + event.getMessage());
 }
}
