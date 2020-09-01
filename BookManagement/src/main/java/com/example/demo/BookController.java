package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookServices  bookservices;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks() {
		return bookservices.getAllBooks();
	}
	
	@RequestMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable String id){
		return bookservices.getBook(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/books")
	public void addBook(@RequestBody Book b) {
		bookservices.addBook(b);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/books/{id}")
	public void updateBook(@PathVariable String id,@RequestBody Book b) {
		
		bookservices.updateBook(id,b);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/books/{id}")
	public void deletebook(@PathVariable String id) {
		bookservices.deleteBook(id);
	}
	
}
