package com.theater.moviemanagement.entity;

import java.util.ArrayList;
import java.util.List;

public class User{
	private int accountId;
	private String name;
	private List<Movie> bookingList = new ArrayList<Movie>();
	
	public void bookMovieTicket(Movie movie,int numberOfSeats){
		try {
		movie.bookSeat(numberOfSeats, this.accountId);
		bookingList.add(movie);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Sorry all seats are full!!");
		}
	}
	
	public void cancelTicket(Movie movie, int seatnumber) {
		movie.cancelBooking(seatnumber);
	}
	
	public User(int accountId, String name) {
		this.accountId = accountId;
		this.name = name;
	}
	public int getAccountId() {
		return accountId;
	}
	public String getName() {
		return name;
	}
	public List<Movie> getBookingList() {
		return bookingList;
	}

}
