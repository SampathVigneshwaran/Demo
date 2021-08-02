package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloWorld {

	@GetMapping("/")
	public String sayHello() {	
	return "Hello World to all";
	}
	
	@GetMapping("/1")
	public String sayHello1() {	
	return "Hello World 1";
	}
	
	
	
	
}
