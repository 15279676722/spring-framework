package com.example.yq.ioc.multicaster.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author joonwhee
 * @date 2019/6/22
 */
public class MyRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 自己的逻辑处理
		System.out.println("自己的接收器");
    }
}
