/*1)write a simple springboot application and Create docker image for this application*/
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingTest4aDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingTest4aDockerApplication.class, args);
	}
	@GetMapping("/demo")
	public String sayHi()
	{
		return "Welcome To Coding Exam's Docker Application";
	}

}
