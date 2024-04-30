package com.example.TodoApplication.Repository;

public class TodoResponse {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TodoResponse(String message) {
		super();
		this.message = message;
	}

	public TodoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TodoResponse [message=" + message + "]";
	}
}
