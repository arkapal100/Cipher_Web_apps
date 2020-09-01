package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private List<Movie> movies = new ArrayList<Movie>(Arrays.asList(
			new Movie("M01","Avengers","The story of saving the universe"),
			new Movie("M02","Krrish","The Story of Inheritance"),
			new Movie("M03","Shawshank Redemption","The Story of Hope")				
			));
	
	public List<Movie> getAllMovies(){
		return movies;
	}
	
	public Movie getMovie(String id) {
		
		return movies.stream().filter(mov -> mov.getId().equals(id)).findFirst().get();
	}
	
	public void addMovie(Movie mov) {
		
		movies.add(mov);
	}

	public void deleteMovie(String id) {
		// TODO Auto-generated method stub
		
		movies.removeIf(m ->m.getId().equals(id));		
	}

	
	public void updateMovie(Movie updatedMov,String id) {
		// TODO Auto-generated method stub
		//First movies is the original obj
		//step1: Traverse through all movies
		for(int i = 0;i<movies.size();i++)
		{
			Movie currMovie = movies.get(i);
			if(currMovie.getId().equals(id))
			{
				movies.set(i,updatedMov);
			}
		}
	}
}
