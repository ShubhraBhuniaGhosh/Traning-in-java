package com.hsbc.employeepayroll.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Employee implements Serializable,Comparable<Employee>{


	/* Serializable is a black interface it is also called marker interface but it is needed to implement that*/
	public static int count;
	protected int salary;
	private String name;
	
	public Employee(){
		//System.out.println("In Employee");
		count++;
	}
	
	public Employee(int salary, String name){
		this();
		this.salary  = salary;
		this.name = name;
		//System.out.println("In Employee parameteried");
	}	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "salary: " + this.salary + "name: " + this.name;
	}
	
	public abstract int calculateSalary();

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}
	
	/* Comparable compare 2 natural sorting algorithm for the class in which it is implemented.
	 * What if we need additional sorting algorithms apart from natural sorting?
	 * you cannot do that using Comparable
	 * to achieve additional sorting algos or to implement, java give you one more interface name --> Comparator*/
	
	@Override
	public int compareTo(Employee employee) {
		return this.salary - employee.salary;
	}
	
}
