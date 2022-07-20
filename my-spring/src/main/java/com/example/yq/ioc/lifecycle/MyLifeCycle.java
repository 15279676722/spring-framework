package com.example.yq.ioc.lifecycle;

import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;

/**
 * @author yangqiang
 * @create 2022-07-20 14:59
 */
public class MyLifeCycle implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("MyLifeCycle.start");
	}

	@Override
	public void stop() {
		System.out.println("MyLifeCycle.stop");
	}

	@Override
	public boolean isRunning() {
		System.out.println("MyLifeCycle.isRunning");
		return false;
	}


}
