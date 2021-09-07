package com.hsbc.usermanagement.entity;
public class User{
	private int id;
	private String name; // These are instance variables
	
	private Address permanantAddress; // has-A (relation)
	
	
	public User(int id, String name, Address permanantAddress) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.permanantAddress = permanantAddress;
	}

	public Address getPermanantAddress() {
		return permanantAddress;
	}

	public void setPermanantAddress(Address permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	public void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		this.permanantAddress.displayAddress();
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id<0) {
			return;
		}
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// This method will be implicit called when we print object be of this class
	// This will return object in string form
	// for overriding the no of argument and the return type should be same
	// @Override -> this is called  and tells that we are overriding a method
	//this is to tell me that i have written toString correctly
	
	@Override
	public String toString() { // must be written toString and not tostring
		//System.out.println("In toString");
		return this.id + " " + this.name +" "+ this.permanantAddress;
		
	}

}