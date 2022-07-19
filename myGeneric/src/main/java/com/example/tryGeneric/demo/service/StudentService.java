package com.example.tryGeneric.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tryGeneric.demo.Repo.StudentDao;
import com.example.tryGeneric.demo.model.Student;


@Service
public class StudentService {

	@Autowired StudentDao studentDao;
	
	public Optional<Student> getById(Long id){
		return studentDao.findById(id);
	}
	
}
