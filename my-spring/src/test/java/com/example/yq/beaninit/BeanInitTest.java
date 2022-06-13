package com.example.yq.beaninit;

import com.example.yq.ioc.aware.AwareBean;
import com.example.yq.ioc.bean.UserService;
import com.example.yq.ioc.config.AwareBeanConfig;
import com.example.yq.ioc.config.InitBeanConfig;
import com.example.yq.ioc.initbean.InitBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangqiang
 * @create 2022-05-25 22:52
 */
public class BeanInitTest {


	@Test
	public void testBean(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(InitBeanConfig.class);
		InitBean initBean = context.getBean(InitBean.class);
	}
}
