package com.hsbc.employeepayroll.dao.impl;

import java.util.List;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;

public class EmployeeDBDaoImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee[] findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findAmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployeesNameStartsWith(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployeesSalaryBetween(int lowerSalary, int higherSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
