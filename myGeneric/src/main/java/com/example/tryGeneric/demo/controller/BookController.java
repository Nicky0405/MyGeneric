package com.example.tryGeneric.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tryGeneric.demo.Repo.BaseRepo;
import com.example.tryGeneric.demo.model.Book;

@RestController
@RequestMapping("/api/book")
public class BookController extends GenericController<Book>{

	public BookController(BaseRepo<Book> repository) {
		super(repository);
	}

	
	
}
