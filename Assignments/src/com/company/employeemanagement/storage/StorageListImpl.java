package com.company.employeemanagement.storage;

import java.util.ArrayList;
import java.util.List;

import com.company.employeemanagement.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;

public class StorageListImpl implements Storage {

	private List<Employee> employees = new ArrayList<Employee>();
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		Employee[] empls = (Employee[])employees.toArray();
		for(Employee employee:empls) {
			if(employee!=null) {
				if(employee.getEmpNo()==e.getEmpNo()) {
					throw new EmployeeAlreadyExistsException();
				}
			}
		}
		employees.add(e);
	}

	@Override
	public Employee getEmployee(int empno){
		// TODO Auto-generated method stub
		Employee[] empls = (Employee[])employees.toArray();
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
