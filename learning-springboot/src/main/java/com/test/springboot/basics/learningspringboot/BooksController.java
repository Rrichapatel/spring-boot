package com.test.springboot.basics.learningspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book(1l,"XXX","java 1.8"));
		books.add(new Book(2l, "yyy", "Spring 5.0 " ));
		
		return books;
		
	}

}
