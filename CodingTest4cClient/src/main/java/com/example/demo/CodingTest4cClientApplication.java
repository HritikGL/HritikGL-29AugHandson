/*3)write a simple Microservice application using Eureka server and Eureka Client	*/
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingTest4cClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingTest4cClientApplication.class, args);
	}
	
	 @GetMapping
	 public String hello() {
	 return "Coding Exam Eureka Client Application";
	 }

}
