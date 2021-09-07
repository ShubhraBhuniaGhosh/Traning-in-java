package com.company.employeemanagement.entity.validate;
import com.company.employeemanagement.entity.InvalidAgeException;
import com.company.employeemanagement.entity.WrongInputException;

public class AgeValidator {
	public String getAgeCode(int age) throws InvalidAgeException {
		if(age<0)
		throw new InvalidAgeException();
		else if(age<18)
			return "Child";
		else
			return "Adult";
	}
}
