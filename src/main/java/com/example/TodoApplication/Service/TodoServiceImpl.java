package com.example.TodoApplication.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoApplication.Model.Todo;
import com.example.TodoApplication.Repository.TodoRepo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepo todoRepo;
//	@Override
//	public List<Todo> getAllTodos(String userName) {
//		// TODO Auto-generated method stub
//		return todoRepo.findByuserName(userName);
//	}

	@Override
	public ArrayList<Todo> getAllTodos(String userName) {
		ArrayList<Todo> todos = todoRepo.findByuserName(userName);
//	    System.out.println("Todos found for " + userName + ": " + todos.size());
//	    System.out.println(todos.get(0));
	    return todos;
	}

	@Override
	public long deleteTodo(String discreption) {
		
			return todoRepo.deleteByDiscription(discreption);
	
		
	}

	@Override
	public Todo getTodoByDescreption(String description) {
		// TODO Auto-generated method stub
		Optional<Todo> list=todoRepo.findByDiscription(description);
		return list.orElse(null);
	}

}
