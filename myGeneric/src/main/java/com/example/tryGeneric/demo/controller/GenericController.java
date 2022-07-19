package com.example.tryGeneric.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.tryGeneric.demo.Repo.BaseRepo;
import com.example.tryGeneric.demo.model.GenericEntity;
import com.example.tryGeneric.demo.service.GenericService;

public class GenericController<T extends GenericEntity<T>> {

	private GenericService<T> service;
	
	public GenericController(BaseRepo<T> repository) {
        this.service = new GenericService<T>(repository) {};
    }

    @GetMapping("")
    public ResponseEntity<List<T>> getPage(Pageable pageable){
        return ResponseEntity.ok(service.getPage());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<T>> getOne(@PathVariable Long id){
        return ResponseEntity.ok(service.get(id));
    }
    
//    @GetMapping("/")
}
