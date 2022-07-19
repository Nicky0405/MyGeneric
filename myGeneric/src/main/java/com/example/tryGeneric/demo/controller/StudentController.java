package com.example.tryGeneric.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tryGeneric.demo.Repo.BaseRepo;
import com.example.tryGeneric.demo.model.Book;
import com.example.tryGeneric.demo.model.Student;
import com.example.tryGeneric.demo.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController extends GenericController<Student>{
	
	@Autowired StudentService studentService;

	public StudentController(BaseRepo<Student> repository) {
		super(repository);
	}

	
	@GetMapping("/custom/{id}")
	public Optional<Student> getById(@PathVariable Long id){
		
		
		return studentService.getById(id);
	}
	
}
