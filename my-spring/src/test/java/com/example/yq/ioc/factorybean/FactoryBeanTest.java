package com.example.yq.ioc.factorybean;

import com.example.yq.ioc.bean.UserService;
import com.example.yq.ioc.config.FactoryBeanConfig;
import com.example.yq.ioc.config.InitBeanConfig;
import com.example.yq.ioc.initbean.InitBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangqiang
 * @create 2022-05-25 22:52
 */
public class FactoryBeanTest {


	@Test
	public void testBean(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
		MyFactoryBean myFactoryBean = context.getBean(MyFactoryBean.class);
		System.out.println(myFactoryBean);

		UserService userService= (UserService)context.getBean("myFactoryBean");
		userService.getUserName();
		MyFactoryBean myFactoryBean1 =(MyFactoryBean) context.getBean("&myFactoryBean");
	}
}
