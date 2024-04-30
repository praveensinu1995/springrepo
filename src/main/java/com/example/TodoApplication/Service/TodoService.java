package com.example.TodoApplication.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.TodoApplication.Model.Todo;


public interface TodoService {

	public ArrayList<Todo> getAllTodos(String userName);

	public long deleteTodo(String discreption);

	public Todo getTodoByDescreption(String description);

}
