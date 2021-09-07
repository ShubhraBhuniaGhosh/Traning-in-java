package com.company.employeemanagement.dao.Impl;

import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.storage.Storage;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;
import com.productstore.employeemanagement.dao.EmployeeDao;


public class EmployeeDaoImpl implements EmployeeDao{
	
	
	@Override
	public void addEmployee(Employee e, Storage storage) throws EmployeeAlreadyExistsException {
		
	}


	public Employee getEmployee(int empno, Storage storage) throws EmployeeNotFoundException{
		Employee employee;
		try {
			employee = storage.getEmployee(empno);
			if(employee!=null) {
				return employee;
			}else {
				throw new EmployeeNotFoundException();
			}
		} catch (Exception e) {
			System.out.println("Invalid Entries");
			e.printStackTrace();
			throw new EmployeeNotFoundException();			
		}
	}
}
