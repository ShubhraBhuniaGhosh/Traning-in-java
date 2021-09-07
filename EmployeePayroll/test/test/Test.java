package test;
import java.io.IOException;

import com.hsbc.employeepayroll.dao.EmployeeDao;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.entity.Manager;
import com.hsbc.employeepayroll.factory.EmployeeDaoFactory;
import com.hsbc.employeepayroll.view.EmployeeView;
import com.hsbc.employeepayroll.view.View;

/*
 * This class is responsible for deciding the flow of our application 
 * Any communication between view and DAO has to happen through this class
 * No Direct COMMUNICATION 
 */


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Employee.count);
//		Manager m1 = new Manager(2,1000,"shubhra");
//		System.out.println(m1);
//		System.out.println(Employee.count);
		
//		Manager m2 = new Manager(5,1000, "Aliza");
//		System.out.println(m2);
//		System.out.println(Employee.count);
// ___________________________________________________________________________________________		
//						
		// this is also possible
//		Employee e = new Manager(2,1000,"shubhra"); // This is called upcasting
//		e.calculateSalary(); 
		//this will call calculateSalary() of manager
		
//		Object o = new Manager();
		
		/* objects are created at runtime so the compiler only sees the reference
		 * like of which class does the reference belong to*/ 
// _____________________________________________________________________________________________________________		
//		
//		
//		// this is also ass naming convention just like sc in Scanner
//		EmployeeInMemoryArrayDaoImpl dao = new EmployeeInMemoryArrayDaoImpl();
//		dao.addEmployee(e);
//								
//		for(Employee emp: dao.findAllEmployess()) {
//			System.out.println(emp);
//		}
//		
//		EmployeeView view1 = new EmployeeView(); 
//		//This is tightly coupled with a specific view, need to remove this tight couple
//		//how?
//		view1.displayAllEmployess(dao.findAllEmployees());
//		
//		//Calendar - built in class abstract.
//		//HttpServlet - built in class abstract.
//		
//		EmployeeExcelView view2 = new EmployeeExcelView();
//		view2.displayAllEmployess(dao.findAllEmployees());
// _______________________________________________________________________________________________________________		
//		// Referring EmployeeInMemoryArrayDaoImpl by interface reference (EmployeeDao)
//		EmployeeDao dao1 = new EmployeeInMemoryArrayDaoImpl(); 
//		dao1.addEmployee(e);
//		
//		// We can make reference variable of interface and they can point to class object implementing
//		// classes implementing interface must implement all method of interface or be abstract.
//		View view3 = new EmployeeView(); // removed tight coupling 
//		view3.displayAllEmployess(dao.findAllEmployees());

// _______________________________________________________________________________________________________________		
//		// factory is a given name is a standard design patern and its job its to make different implementations of employeeDao
//		EmployeeDaoFactory factory = new EmployeeDaoFactory();
//		EmployeeDao dao2 = factory.getEmployeeDao(); //loosely coupled 
//		dao2.addEmployee(e);
//		
//		View view4 = new EmployeeView(); // removed tight coupling 
//		view4.displayAllEmployess(dao2.findAllEmployees());
// _______________________________________________________________________________________________________________		
//
//		try {
//			dao2.findAmployeeByName("vidhi");
//			View view5 = new EmployeeView(); 
//			view5.displayAllEmployess(dao2.findAllEmployees());
//		} catch (EmployeeNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
// _______________________________________________________________________________________________________________		
//		
		Employee e = new Manager("Shubhra", 1000, 2);

//		EmployeeDaoFactory factory = new EmployeeDaoFactory(); 
		
		/* This is not needed because now getEmployeeDao is 
		*static (we copied technique this from calendar class hence we also have
		*no need to create object of EmployeeDaoFactory anymore */ 
		
		EmployeeDao dao;
		try {
//			dao = factory.getEmployeeDao();
			dao = EmployeeDaoFactory.getEmployeeDao();

			dao.addEmployee(e);
			Employee[] employees = dao.findAllEmployees();
			View view = new EmployeeView(); // removed tight coupling 
			view.displayAllEmployess(employees);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
				
		
		
		
	}

}
