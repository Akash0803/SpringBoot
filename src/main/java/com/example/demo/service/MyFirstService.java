package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.demo.dao.StudentRepo;

import com.example.demo.model.Student1;
@Service
public class MyFirstService {
	@Autowired
	StudentRepo studRepo;
	public List<Student1> getStudents(){
		
		return studRepo.findAll();
	}
	
	public Student1 saveStudent(Student1 student) {
		studRepo.save(student);
		return student;
	}
	
	public String deleteStudent(Long id) {
		//Student1 s=studRepo.getOne(id);
		studRepo.deleteById(id);
		return "Deleted";
	}
	public Student1 saveOrUpdateStudent(Student1 student) {
		studRepo.save(student);
		return student;
	}
}
