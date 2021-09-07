package com.hsbc.employeepayroll.util; //Utility

import java.util.Comparator;

import com.hsbc.employeepayroll.entity.Employee;

public class EmployeeSortByName implements Comparator<Employee> {
	/* using Comparator we don't have to make changes in the class we are comparing
	 * using Comparator we can camper 3ed party class (classes which someone else has made)
	 */
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

/* Comparable-lang --> compareTo
 * Comparator-util -->compare
*/
