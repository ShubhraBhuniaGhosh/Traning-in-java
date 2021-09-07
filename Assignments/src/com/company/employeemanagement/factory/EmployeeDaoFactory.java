package com.company.employeemanagement.factory;

import com.company.employeemanagement.dao.EmployeeDao;
import com.company.employeemanagement.dao.Impl.EmployeeDaoImpl;

public class EmployeeDaoFactory {
	
	public static EmployeeDao getEmployeeDao() {

	EmployeeDaoImpl dao= new EmployeeDaoImpl();
	
	return dao;
	}
}
