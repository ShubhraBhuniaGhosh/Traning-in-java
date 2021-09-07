package com.hsbc.employeepayroll.view;

import com.hsbc.employeepayroll.entity.Employee;

public interface View {
	void displayAllEmployess(Employee[] emps);
	// by default interface methods are abstract
	// by default interface variable are public 
	// by default interface variable are final
	
	// interfaces are to make a contract with unrelated classes which do same kind of things.

}
