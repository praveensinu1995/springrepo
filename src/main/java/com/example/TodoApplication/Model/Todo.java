package com.example.TodoApplication.Model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Document(collection = "todo")

public class Todo {
//	public static final String HttpStatus = null;
	@org.springframework.data.annotation.Id
	String Id;
	String userName;
	String discription;
	Date targetedDate;
	boolean isCompleted;
	@Override
	public String toString() {
		return "Todo [Id=" + Id + ", userName=" + userName + ", discription=" + discription + ", targetedDate="
				+ targetedDate + ", isCompleted=" + isCompleted + "]";
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Date getTargetedDate() {
		return targetedDate;
	}
	public void setTargetedDate(Date targetedDate) {
		this.targetedDate = targetedDate;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(String id, String userName, String discription, Date targetedDate, boolean isCompleted) {
		super();
		Id = id;
		this.userName = userName;
		this.discription = discription;
		this.targetedDate = targetedDate;
		this.isCompleted = isCompleted;
	}
}
