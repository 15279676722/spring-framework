package com.example.yq.aop.pointcut;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringValueResolver;

/**
 * @author yangqiang
 * @create 2022-07-19 15:16
 */
public class MyAware implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, EnvironmentAware, EmbeddedValueResolverAware, ResourceLoaderAware, ApplicationEventPublisherAware,MessageSourceAware,ApplicationStartupAware, ApplicationContextAware, ImportAware {

	private String beanName;
	private BeanFactory beanFactory;
	private ClassLoader classLoader;
	private ApplicationContext applicationContext;
	private ApplicationEventPublisher applicationEventPublisher;
	private ApplicationStartup applicationStartup;
	private StringValueResolver stringValueResolver;
	private Environment environment;
	private MessageSource messageSource;
	private ResourceLoader resourceLoader;
	private AnnotationMetadata annotationMetadata;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	@Override
	public void setApplicationStartup(ApplicationStartup applicationStartup) {
		this.applicationStartup = applicationStartup;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.stringValueResolver = resolver;
	}

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		this.annotationMetadata = importMetadata;
	}

	public String getBeanName() {
		return beanName;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public ClassLoader getClassLoader() {
		return classLoader;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public ApplicationEventPublisher getApplicationEventPublisher() {
		return applicationEventPublisher;
	}

	public ApplicationStartup getApplicationStartup() {
		return applicationStartup;
	}

	public StringValueResolver getStringValueResolver() {
		return stringValueResolver;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public ResourceLoader getResourceLoader() {
		return resourceLoader;
	}


}
