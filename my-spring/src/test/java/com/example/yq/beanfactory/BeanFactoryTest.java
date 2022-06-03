package com.example.yq.beanfactory;

import com.example.yq.config.BeanFactoryConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangqiang
 * @create 2022-05-25 22:52
 */
public class BeanFactoryTest {


	@Test
	public void testBean(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(BeanFactoryConfig.class);
		MyBeanFactoryPostProcessor myBeanFactoryPostProcessor = context.getBean(MyBeanFactoryPostProcessor.class);
	}
}
