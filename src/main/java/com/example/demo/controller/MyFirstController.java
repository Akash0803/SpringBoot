package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student1;
import com.example.demo.service.MyFirstService;

@RestController
public class MyFirstController  {
	@Autowired
	MyFirstService service;
	@GetMapping("/getstudents")
	public List<Student1> getStudents() {
		return service.getStudents();
	}
	
	
	
	
	
	
	@PostMapping("/createstudent")
	public Student1 create(@RequestBody Student1 student) {
		
		return service.saveStudent(student);
	}
	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return service.deleteStudent(id);
	}
	@PutMapping(path="/updatestudent")
	public Student1 updateStudent(@RequestBody Student1 student) {
		service.saveOrUpdateStudent(student);
		return student;
	}
}
