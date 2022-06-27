package com.example.yq.aop.replaced;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangqiang
 * @create 2022-06-27 11:33
 */
public class ReplacedTest {
	@Test
	public void ReplacedXml(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("aop-spring-replaced.xml");
		ReplacedBean replacedBean = (ReplacedBean) context.getBean(ReplacedBean.class);
		replacedBean.test("smallWhite",26);
		replacedBean.test();
	}
}
