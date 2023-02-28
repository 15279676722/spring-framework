package com.example.yq.ioc.aware;

import com.example.yq.ioc.config.AwareBeanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangqiang
 * @create 2022-05-25 22:52
 */
public class AwareTest {


	@Test
	public void testBean(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AwareBeanConfig.class);
		AwareBean awareBean = context.getBean(AwareBean.class);
		ApplicationContext applicationContext = awareBean.getApplicationContext();
		System.out.println(applicationContext);
	}
}
