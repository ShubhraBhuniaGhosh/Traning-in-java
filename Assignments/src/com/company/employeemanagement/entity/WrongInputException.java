package com.company.employeemanagement.entity;

public class WrongInputException extends RuntimeException{
	public WrongInputException(){
		super();
	}
	public WrongInputException(String message){
		super(message);
	}
	
	public WrongInputException(Throwable cause){
		super(cause);
	}
	public WrongInputException(String message, Throwable cause){
		super(message, cause);
	}

}
