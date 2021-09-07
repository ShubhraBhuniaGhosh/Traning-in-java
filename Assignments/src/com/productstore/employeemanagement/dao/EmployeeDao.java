package com.productstore.employeemanagement.dao;

import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.storage.Storage;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

public interface EmployeeDao {

	void addEmployee(Employee e, Storage storage) throws EmployeeAlreadyExistsException;
	Employee getEmployee(int empno, Storage storage) throws EmployeeNotFoundException, Exception;
}
