package com.example.yq.xml.circulardependency;

import com.example.yq.config.CircularDependencyConfig;
import com.example.yq.lookup.annotation.LookUpBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
