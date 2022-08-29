package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;

public class TestWebApp extends CodingTest4bApplicationTests {

 @Autowired

 private WebApplicationContext webApplicationContext;

 private MockMvc mockMvc;

 @BeforeEach

 public void setup() {

 mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

 }

 @Test

 public void testEmployee() throws Exception {

 mockMvc.perform(get("/student")).andExpect(status().isOk())

  .andExpect(content().contentType("application/json"))

  .andExpect(jsonPath("$.name").value("Hero")).andExpect(jsonPath("$.standard").value("V"))

  .andExpect(jsonPath("$.Id").value("101")).andExpect(jsonPath("$.fees").value(7000));

 }

}
