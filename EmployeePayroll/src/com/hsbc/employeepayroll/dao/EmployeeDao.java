package com.hsbc.employeepayroll.dao;

import java.util.List;

import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	void addEmployee(Employee e);
	
	Employee[] findAllEmployees();
	
	Employee findAmployeeByName(String name) throws EmployeeNotFoundException;
	
	List<Employee> findAllEmployeesNameStartsWith(String name);
	List<Employee> findAllEmployeesSalaryBetween(int lowerSalary, int higherSalary);
	int deleteById(int id);
	//update method for update employee
}
