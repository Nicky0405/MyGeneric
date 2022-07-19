package com.example.tryGeneric.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tryGeneric.demo.model.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

}
