package com.example.TodoApplication.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.TodoApplication.Model.Todo;

public interface TodoRepo extends MongoRepository<Todo, String> {

	public ArrayList<Todo> findByuserName(String userName);

	public long deleteByDiscription(String discreption);

	public Optional<Todo> findByDiscription(String description);

}
