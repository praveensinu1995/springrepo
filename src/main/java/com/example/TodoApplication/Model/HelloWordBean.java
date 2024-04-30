package com.example.TodoApplication.Model;

public class HelloWordBean {

	String message;

	public String getMessage() {
		return message;
	}

	public HelloWordBean(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWordBean [message=" + message + "]";
	}
}
