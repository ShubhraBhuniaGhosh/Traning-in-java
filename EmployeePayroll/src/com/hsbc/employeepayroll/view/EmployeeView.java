package com.hsbc.employeepayroll.view;

import com.hsbc.employeepayroll.entity.Employee;

/**
 * 
 * @author Shubhra Bhunia Ghosh
 *
 *The purpose of this class is to display all the employee in the user friendly format
 *This class plays the roll of "VIEW LAYER"
 *
 */


public class EmployeeView implements View {

	@Override
	public void displayAllEmployess(Employee[] employees) {
		
		System.out.println("------------------------");
//		System.out.println("name \t salary");
		System.out.println("name \t ");

		System.out.println("------------------------");
		for(Employee employee: employees) {
			
			if (employee!= null) {
//				System.out.println(employee.getName() + " \t" + employee.getSalary());
				System.out.println(employee.getName() + " \t");

			}
		}
	}
	
	public void acceptEmployeeDetails() {
		/*
		 * This method is responsible for getting i/p from the user
		 * View will not talk to DAO or vice versa (security issues and tight coupling)
		 */
	}
}




/*
 * class extends class
 * class implements interface(s)
 * interface extends interface 
 * class extends class implements interface
 * class implements interface1, interface2
 * class extends class1, class2 -> not valid
 * class extends class1, implements -> not valid
 * class implements interface  -> not valid
 * class extends class implements interface1
 * class implements interface extends interface
 */
