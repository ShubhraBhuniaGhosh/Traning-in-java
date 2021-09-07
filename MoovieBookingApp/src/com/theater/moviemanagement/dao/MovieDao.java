package com.theater.moviemanagement.dao;

import com.theater.moviemanagement.entity.Movie;

public interface MovieDao {
	public void addMovie(Movie movie);
	public void findAllMovie();
	public void findMovieByName(String movieName);


}
