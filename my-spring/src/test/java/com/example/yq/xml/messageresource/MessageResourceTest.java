package com.example.yq.xml.messageresource;

import com.example.yq.ioc.messagesource.MessageSourceConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * @author yangqiang
 * @create 2022-06-07 10:40
 */
public class MessageResourceTest {

	@Test
	public void testMessageResource(){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(MessageSourceConfig.class);
		MessageSource messageSource = context.getBean(MessageSource.class);

		System.out.println(messageSource.getMessage("name", null, null));

		System.out.println(messageSource.getMessage("name", null, null, Locale.CHINA));
		System.out.println(messageSource.getMessage("name", null, null, Locale.ENGLISH));
		System.out.println(messageSource.getMessage("name",null,null,Locale.GERMAN));

	}
}
