package com.company.employeemanagement.entity;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Comparable<Employee>{

	private int empNo;
	private String firstName;
	private String lastName;
	private String city;
	private int salary;
	private Date dateOfJoining;
	
	public static int count;
	
	
	public Employee(int empNo, String firstName, String lastName, String city, int salary) {
		super();
		count++;
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empName) {
		this.empNo = empName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.empNo == ((Employee)obj).empNo;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empNo-o.empNo;
	}

	
}
