package com.example.yq.xml.propertyeditor;

import com.example.yq.ioc.messagesource.MessageSourceConfig;
import com.example.yq.ioc.propertyeditor.Content;
import com.example.yq.ioc.propertyeditor.ContentPropertyEditor;
import com.example.yq.ioc.propertyeditor.Job;
import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @author yangqiang
 * @create 2022-06-17 23:02
 */
public class PropertyEditorTest {
	@Test
	public void testMessageResource(){
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("property-editor.xml");
		context.getBeanFactory().addPropertyEditorRegistrar(registry -> {
			if (registry instanceof PropertyEditorRegistrySupport) {
				((PropertyEditorRegistrySupport) registry).overrideDefaultEditor(Content.class, new ContentPropertyEditor());
				System.out.println("PropertyEditorRegistrySupport");
			} else {
				registry.registerCustomEditor(Content.class, new ContentPropertyEditor());
			}
		});


		Job job =(Job) context.getBean("job");
		System.out.println(job);
	}
}
