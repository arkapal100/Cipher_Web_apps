package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//Define a function to handle the request
	
	//Defining url which will trigger the controller or function
	
	@RequestMapping("/greet")
	public String greet() {
		return "<h2>Hello from SpringBoot Application</h2>";
	}
	@RequestMapping("/getmovies")
	public List<Movie> getMovies() {
		
		return Arrays.asList(
				new Movie("M01","Avengers","The story of saving the universe"),
				new Movie("M02","Krrish","The Story of Inheritance"),
				new Movie("M03","Shawshank Redemption","The Story of Hope")				
				);
	}
}
