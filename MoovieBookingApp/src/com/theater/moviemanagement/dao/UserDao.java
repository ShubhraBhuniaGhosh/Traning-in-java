package com.theater.moviemanagement.dao;

import com.theater.moviemanagement.entity.User;

public interface UserDao {
	public void addMovie(User user);
	public void findAllUser();
	public void findUserByName(String userName);
}
