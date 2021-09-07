package com.theater.moviemanagement.entity;

public class Movie {
	private  String name  ;
	private  int[] seat;
	private  int seatCount = 0;

	public Movie(String name) {
		this.name = name;
		this.seat =  new int[60];
		this.seatCount = 0;
	}
	
	public void bookSeat(int numberOfSeats, int accountId) throws ArrayIndexOutOfBoundsException{
		System.out.println("Seats booked are:");
		for(int i = 0; i<numberOfSeats;i++) {
			seat[seatCount+i] = accountId;
		}
		for(int i = 0; i<numberOfSeats;i++) {
			System.out.print((seatCount+i+1) + "\t");
		}
		seatCount+=numberOfSeats;
	}
	
	public void cancelBooking(int seatnumber) {
		seat[seatnumber]  = 0;
		System.out.println("Booking of seatnumber: "+seatnumber+" is canceled");
	}

	public String getName() {
		return name;
	}
	public int[] getSeat() {
		return seat;
	}
	public  int getSeatCount() {
		return seatCount;
	}
	
}
