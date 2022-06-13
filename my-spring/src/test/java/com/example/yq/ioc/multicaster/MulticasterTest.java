package com.example.yq.ioc.multicaster;

import com.example.yq.ioc.multicaster.event.MyApplicationEvent;
import com.example.yq.ioc.multicaster.listener.MyAnnotationApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MulticasterTest {

 public static void main(String[] args) {

  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

  context.registerBean(MyAnnotationApplicationListener.class);

  context.refresh();

  MyApplicationEvent myApplicationEvent = new MyApplicationEvent(context, "呼叫土豆,呼叫土豆!");

  context.publishEvent(myApplicationEvent);

 }
}
