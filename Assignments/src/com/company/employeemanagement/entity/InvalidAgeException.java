package com.company.employeemanagement.entity;

public class InvalidAgeException extends Exception{
	public InvalidAgeException(){
		super();
	}
	public InvalidAgeException(String message){
		super(message);
	}
	
	public InvalidAgeException(Throwable cause){
		super(cause);
	}
	public InvalidAgeException(String message, Throwable cause){
		super(message, cause);
	}

}
