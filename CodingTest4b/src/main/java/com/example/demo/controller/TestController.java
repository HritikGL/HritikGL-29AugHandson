package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class TestController {

	 @RequestMapping(value = "/student", method = RequestMethod.GET)

	 public Student firstPage() {

	 Student std = new Student();

	 std.setName("Hero");

	 std.setId("101");

	 std.setStandard("V");

	 std.setFees(7000.0);

	 return std;
}
	 
}