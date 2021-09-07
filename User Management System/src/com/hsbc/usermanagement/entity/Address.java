package com.hsbc.usermanagement.entity;

public class Address {
	private String city;
	private int pincode;
	
	public Address(String city, int pincode){
		this.city = city;
		this.pincode = pincode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void displayAddress() {
		// TODO Auto-generated method stub
		System.out.println(this.city);
		System.out.println(this.pincode);
	}
	
	@Override
	public String toString() {
		return this.city + " " + this.pincode;
		
	}

}
