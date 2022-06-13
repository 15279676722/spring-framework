package com.example.yq.xml.circulardependency;

import com.example.yq.ioc.config.CircularDependencyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangqiang
 * @create 2022-06-10 19:32
 */
public class circularDependencyTest {
	@Test
	public void circularDependency(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(CircularDependencyConfig.class);

	}
}
