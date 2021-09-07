package com.hsbc.employeepayroll.entity;
public class Manager extends Employee {
	
	
	private int numberOfProject;
	
	public Manager() {
		// TODO Auto-generated constructor stub
		
		// this and super both should be the fist statement in the constructed 
		// hence should not be called together
		
		super();
		// this(1,1000," ")
		//this will be called implicitly even if i don't put super(
		//System.out.println("In Manager");

	}
	
	public Manager(int numberOfProject, int salary, String name) {
		super(salary, name);
		this.numberOfProject = numberOfProject;
		//System.out.println("In Manager parameterized");

	}
	
	public Manager(String name, int salary, int numberOfProject) {
		// TODO Auto-generated constructor stub
		super(salary, name);
		
	}

	public String toString() {
		return super.toString()+ "number Of Project " + this.numberOfProject;
	}
	
	@Override
	public int calculateSalary() {
		System.out.println("in Manager");
		return super.getSalary() + 100*this.numberOfProject;
	}
	
//	@Override
//	public boolean equals(Object manager){
//		System.out.println("in equals of manager");
//		return true;
//	}
//	
//	@Override
//	public int hashCode(){
//		System.out.println("in hascode of manager");
//		return 5; /* This is inefficient hash code
//					TODO improve this hash code	
//		 			*/
//	}

}
