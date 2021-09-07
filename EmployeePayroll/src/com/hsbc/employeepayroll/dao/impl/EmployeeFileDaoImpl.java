package com.hsbc.employeepayroll.dao.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.exception.EmployeeNotFoundException;

public class EmployeeFileDaoImpl implements EmployeeDao {
	/*
	 *all the letter of the constant should be in upper case separated by _
	 *final variable are constant there value cannot be changed 
	 */
	private final String FILE_NAME = "C:\\Users\\tells\\eclipse-workspace\\Inheritence\\Emp.txt";
	private ObjectInputStream ois = null; // this class is capable of reading object from a file
	private ObjectOutputStream oos = null; // this class is capable of reading object from a file
	private FileInputStream fis  = null;
	private FileOutputStream fos = null;
	public EmployeeFileDaoImpl() throws IOException {
		fos = new FileOutputStream(FILE_NAME);
		fis = new FileInputStream(FILE_NAME);
		oos = new ObjectOutputStream(fos);
		ois = new ObjectInputStream(fis);
	}

	@Override
	public void addEmployee(Employee e) {
		try {
			oos.writeObject(e); //writeObject is a specific method of objectOutputStreem which writes object to file
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public Employee[] findAllEmployees() {
		/*Down cast*/
		Employee[] employees = new Employee[1];
		try {
			/* This will read object from file which is associated with ois reference*/
			Employee e = (Employee) ois.readObject();
			employees[0] = e;
			return employees;
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee findAmployeeByName(String name) throws EmployeeNotFoundException {
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
