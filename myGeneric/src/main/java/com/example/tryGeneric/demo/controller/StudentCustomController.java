package com.example.tryGeneric.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.tryGeneric.demo.model.Student;
import com.example.tryGeneric.demo.service.StudentService;

@RestController
public class StudentCustomController {

	@Autowired StudentService studentService;
	
	@GetMapping("/student/{id}")
	public Optional<Student> getById(@PathVariable Long id){
		
		
		return studentService.getById(id);
	}
}
