package com.hsbc.employeepayroll.dao.impl;

import java.util.List;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

/*
 *The purpose of this class is to talk to underlying data-store
 *This class plays the roll of "DAO LAYER"
 *
 */



/*
 *  DAO  - stands for data Access Object 
 *  This is a standard pattern which is used to talk to underlying datastore 
 *  (it can be database, or it can be in - memory 
 *  IMPL - is implementation and this is the standard practice how we do in development in java
 */

public class EmployeeInMemoryArrayDaoImpl implements EmployeeDao{

	private Employee[] employees;
	public EmployeeInMemoryArrayDaoImpl() {
		employees = new Employee[2];
	}

	@Override
	public void addEmployee(Employee e ) {
		System.out.println("Employee added");

		employees[0] = e;	
	}

	@Override
	public Employee[] findAllEmployees() {
		return this.employees;
	}

	@Override
	public Employee findAmployeeByName(String name) throws EmployeeNotFoundException {
		/*
		 * We cannot throw additional checked exception in overridden methods
		 * to throw checked exception in overridden method -- use throws in interface 
		 * (in method 
		 * 
		 *  overridden method cannot declare never or broader checked exception 
		 */


		for(Employee foundEmployee : employees) {
			if(foundEmployee!=null) {
				if(foundEmployee.getName().equalsIgnoreCase(name)) {
					return foundEmployee;
				}
			}
		}
		/*
		 * throw user define exception named EmployeeNotFoundExeption
		 */
		throw new EmployeeNotFoundException();
//		return null;
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
