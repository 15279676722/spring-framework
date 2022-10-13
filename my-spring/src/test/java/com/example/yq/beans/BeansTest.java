package com.example.yq.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyEditorSupport;
import java.util.stream.Stream;

public class BeansTest {
	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
		Stream.of(beanInfo.getPropertyDescriptors())
				.forEach(item -> {
					System.out.println(item);
					//PropertyDescriptor 允许添加属性编辑器 - PropertyEditor
					//name->String
					//age->Integer
					String name = item.getName();
					if("age".equals(name)){
						//为age字段添加PropertyEditor
						//String->Integer
						item.setPropertyEditorClass(StringToIntegerPropertyEditor.class);
//						item.createPropertyEditor()
					}
				});
	}

	static class StringToIntegerPropertyEditor extends PropertyEditorSupport{
		@Override
		public void setAsText(String text) throws IllegalArgumentException {
			Integer value = Integer.valueOf(text);
			setValue(value);
		}
	}
}
