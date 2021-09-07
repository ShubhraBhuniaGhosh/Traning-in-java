package com.theater.moviemanagement.entity;

import java.util.List;

public class Ticket {
	private User accountId;
	private Movie movie;
	private List<Integer> seats;
	
	public User getAccountId() {
		return accountId;
	}
	public Movie getMovie() {
		return movie;
	}
	public List<Integer> getSeats() {
		return seats;
	}
	
	
	
}
