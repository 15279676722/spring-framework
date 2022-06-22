package com.example.yq.ioc.propertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * @author yangqiang
 * @create 2022-06-17 23:20
 */
public class ContentPropertyEditor extends PropertyEditorSupport {

	private Object value;

	@Override
	public void setValue(Object value) {
		if(value==null){
			this.value = new Content();
			return;
		}
		this.value = value;
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public String getAsText() {
		return super.getAsText();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Content content = (Content)value;

		String[] split = text.split(":");
		content.setDetails(split[0]);
		content.setType(split[1]);
		content.setPriority(Integer.parseInt(split[2]));
	}
}
