package com.example.TodoApplication.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoApplication.Model.HelloWordBean;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("helloWorld")
public class MyWorldController {

	@GetMapping("hello")
	public String helloword() {
		return "hello World";
	}

	@GetMapping("hello/bean")
	public HelloWordBean helloWordbean() {

		return new HelloWordBean("Helo from bean new");
	}

	@GetMapping("hello/path/{name}")
	public HelloWordBean helloWordPathVariable(@PathVariable String name) {

		return new HelloWordBean("Hello new " + name);
	}
}
