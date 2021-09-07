package com.company.employeemanagement.storage;

import com.company.employeemanagement.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

public interface Storage {
	
	void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
	Employee getEmployee(int empno) throws EmployeeNotFoundException;
}
