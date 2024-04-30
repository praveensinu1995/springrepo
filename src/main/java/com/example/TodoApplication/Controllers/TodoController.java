package com.example.TodoApplication.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoApplication.Model.Todo;
import com.example.TodoApplication.Repository.TodoResponse;
import com.example.TodoApplication.Service.TodoService;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

	@Autowired
	TodoService todoSerive;

	TodoResponse todoResponse=new TodoResponse();
	@GetMapping("/createTodo")
	public String name() {
		return "hi";
	}
	
	@GetMapping("/AllTodos")
	public ResponseEntity<List<Todo>> getAllTodos(@RequestParam String userName) {

		List<Todo> todos=todoSerive.getAllTodos(userName);
		
		return new ResponseEntity<>(todos,HttpStatus.OK);
	}
	
	@GetMapping("/getTodo")
	private ResponseEntity<Todo> getTodoByDescreption(@RequestParam String description) {
		return new ResponseEntity (todoSerive.getTodoByDescreption(description),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletetodo")
	public ResponseEntity<TodoResponse> deleteTodoByDiscription(@RequestParam String discreption ){
		System.out.println("delete");
		if(todoSerive.deleteTodo(discreption)>0) {
			todoResponse.setMessage("deleted");
			return new ResponseEntity<TodoResponse>(todoResponse,HttpStatus.OK);
		}else {
			todoResponse.setMessage("record not founnd");
			return new ResponseEntity<TodoResponse>(todoResponse,HttpStatus.NOT_FOUND);		}
	}
}
