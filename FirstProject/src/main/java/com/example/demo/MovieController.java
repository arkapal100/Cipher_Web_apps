package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	// Dependency Injection
	
	@Autowired
	private MovieService movieservice;

	@CrossOrigin
	@RequestMapping("/movies")
	public List<Movie> getAllMovies() {

		return movieservice.getAllMovies();
	}

	// Write a fun to fetch a specific movie
	@CrossOrigin
	@RequestMapping("/movies/{id}") // id will be retrieved from url
	public Movie getMovie(@PathVariable String id) {

		return movieservice.getMovie(id);
	}
	
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, value = "/movies") // This method must be post as we are creating new
																	// movie
	public void addMovie(@RequestBody Movie mov) {
		movieservice.addMovie(mov);
	}
	
	//Define a fun to delete a movie
	//URL: http://localhost:8081/movies/{ID} this will be url
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.DELETE, value = "/movies/{id}")
	public void deleteMovie(@PathVariable String id) {
		
		movieservice.deleteMovie(id);
	}
	
	//Fun for updating 
	//URL + Request body
	// URL to get the id
	// Requestbody : modified value <--- Request Method : PUT --->
	
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.PUT,value = "/movies/{id}")
	public void updateMovie(@RequestBody Movie updatedMov,@PathVariable String id) {
		movieservice.updateMovie(updatedMov,id);
		
	}
}
