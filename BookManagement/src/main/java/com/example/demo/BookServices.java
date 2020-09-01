package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {
	
	@Autowired
	BookRepository bookrepo;
	
	public List<Book> getAllBooks(){
		
		ArrayList<Book> allBook = new ArrayList<>();
		
		bookrepo.findAll().forEach(allBook :: add);
		return allBook;
	}
	
	public Optional<Book> getBook(String id)
	{
		return bookrepo.findById(id);
	}

	public void addBook(Book b) {
		// TODO Auto-generated method stub
		bookrepo.save(b);
		
	}

	public void updateBook(String id, Book b) {
		// TODO Auto-generated method stub
		bookrepo.save(b);
	}

	public void deleteBook(String id) {
		// TODO Auto-generated method stub
		bookrepo.deleteById(id);
	}
}
