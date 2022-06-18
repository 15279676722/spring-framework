package com.example.yq.ioc.propertyeditor;

public class Job {

	private boolean completed;

	private Content content;
    // get and set method

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Job{" +
				"completed=" + completed +
				", content=" + content +
				'}';
	}
}
