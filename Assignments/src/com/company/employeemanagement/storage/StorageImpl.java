package com.company.employeemanagement.storage;

import com.company.employeemanagement.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;

public class StorageImpl implements Storage {
	
	private Employee[] employees = new Employee[10];
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		employees[Employee.count-1] = e;
		for(Employee employee:employees) {
			if(employee!=null) {
				if(employee.getEmpNo()==e.getEmpNo()) {
					throw new EmployeeAlreadyExistsException();
				}
			}
		}
		if(Employee.count<11)
			employees[Employee.count-1]=e;
		else
			System.out.println("Cannot be inserted");
	}

	@Override
	public Employee getEmployee(int empno){
		// TODO Auto-generated method stub
		if(empno<=10 && empno>0) {
			return employees[empno-1];
		}
		return null;
	}

}
