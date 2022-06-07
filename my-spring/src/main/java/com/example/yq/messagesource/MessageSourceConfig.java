package com.example.yq.messagesource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * @author yangqiang
 * @create 2022-06-07 10:35
 */
@Configuration
public class MessageSourceConfig {
	@Bean
	public MessageSource messageSource(){
		ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
		resourceBundleMessageSource.setDefaultEncoding("UTF-8");
		resourceBundleMessageSource.addBasenames("/message");
		return resourceBundleMessageSource;
	}
}
