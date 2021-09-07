package com.hsbc.employeepayroll.factory;

import java.io.IOException;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.dao.impl.EmployeeFileDaoImpl;
import com.hsbc.employeepayroll.dao.impl.EmployeeInMemoryArrayDaoImpl;

public abstract class EmployeeDaoFactory {
	
	/*abstract so that no one an create the object of EmployeeDaoFactory because
	 * there is no need of creating a object of EmployeeDaoFactory*/
	
	 public static EmployeeDao getEmployeeDao() throws IOException  {
		 EmployeeFileDaoImpl dao = new EmployeeFileDaoImpl();
		 //EmployeeInMemoryArrayDaoImpl  dao= new EmployeeInMemoryArrayDaoImpl();
		 return dao;
	 }
}
