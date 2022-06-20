package com.example.yq.xml.parentbeanfactory;

import com.example.yq.ioc.propertyeditor.Content;
import com.example.yq.ioc.propertyeditor.ContentPropertyEditor;
import com.example.yq.ioc.propertyeditor.Job;
import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistrySupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yangqiang
 * @create 2022-06-20 20:37
 */
public class ParentBeanFactoryTest {
	@Test
	public void ParentBeanFactoryTest(){
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("property-editor.xml");

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"property-editor.xml"},context);
		classPathXmlApplicationContext.getBeanFactory().addPropertyEditorRegistrar(registry -> {
			if (registry instanceof PropertyEditorRegistrySupport) {
				((PropertyEditorRegistrySupport) registry).overrideDefaultEditor(Content.class, new ContentPropertyEditor());
				System.out.println("PropertyEditorRegistrySupport");
			} else {
				registry.registerCustomEditor(Content.class, new ContentPropertyEditor());
			}
		});


		Job job =(Job) classPathXmlApplicationContext.getBean("job");
		System.out.println(job);
	}
}
