package com.company.employeemanagement.storage;

import java.util.HashMap;
import java.util.Map;

import com.company.employeemanagement.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;

public class StorageMapImpl implements Storage{
	private Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		if(employees.put(e.getEmpNo(), e) != null){
			throw new EmployeeAlreadyExistsException();
		}
	}

	@Override
	public Employee getEmployee(int empno){
		return employees.get(empno);
	}
}
