package com.company.employeemanagement.storage;

import java.util.Set;
import java.util.TreeSet;

import com.company.employeemanagement.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;

public class StorageSortedImpl implements Storage {

	private Set<Employee> employees = new TreeSet<Employee>();
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		if(!employees.add(e)) {
			throw new EmployeeAlreadyExistsException();
		}
	}

	@Override
	public Employee getEmployee(int empno){
		// TODO Auto-generated method stub
		Employee[] empls = (Employee[]) employees.toArray();
		for(Employee employee:empls) {
			if(employee!=null) {
				if(employee.getEmpNo()==empno) {
					return employee;
				}
			}
		}
		return null;
	}
}
