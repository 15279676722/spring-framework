package com.example.yq.ioc.propertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author yangqiang
 * @create 2022-07-13 11:45
 */
public class ContentPropertyEditorRegister implements PropertyEditorRegistrar {


	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(ContentPropertyEditor.class,new ContentPropertyEditor());
	}
}
