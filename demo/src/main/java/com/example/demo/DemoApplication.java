package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/greet")
	public String RootEndPoint1() {
		String message = "Welcome to Spring Boot!";
		return message;
	}







	@GetMapping("/greet/Denuwan")
	public String RootEndPoint2() {
		String message = "Hello Denuwan! Welcome to Spring Boot!";
		return message;
	}









	


	@GetMapping("/greet/{name}")
	public String greetUser(
		@PathVariable String name,
		@RequestParam(required = false) String message) {
			if (message != null && !message.isEmpty()) {
				return "Hello " + name + "! " + message;
			}
			return "Hello " + name + "! Welcome to Spring Boot!";
		}
	

	

}

