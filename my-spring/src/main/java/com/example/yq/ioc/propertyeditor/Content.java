package com.example.yq.ioc.propertyeditor;

public class Content {
	private String details;
	private String type;
	private int priority;
	// get and set method

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Content{" +
				"details='" + details + '\'' +
				", type='" + type + '\'' +
				", priority=" + priority +
				'}';
	}
}
