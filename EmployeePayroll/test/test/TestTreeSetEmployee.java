package test;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.employeepayroll.entity.Manager;
import com.hsbc.employeepayroll.util.EmployeeSortByName;

public class TestTreeSetEmployee {

	public static void main(String[] args) {
		/*Comparable is interface in java.lang package 
		 *any object added in tree set must be comparable 
		 *that means it should implement interface comparable
		 *Integer wrapper class implements comparable string*/
		
		
		Manager m1 = new Manager(1, 10, "b");
		Manager m2 = new Manager(1, 100, "a");
		
//		Set<Manager> s = new TreeSet<Manager>(); /*no argument constructor of tree set by default sorts using comparable*/ 
		
		Set<Manager> s = new TreeSet<Manager>(new EmployeeSortByName());
		
		boolean result = s.add(m1);
		System.out.println(result);		
		result = s.add(m2);
		System.out.println(result);
		System.out.println(s);
	}

}


/* Two objects which are EQUAl by equals() their HashCode MUST be same
 * Two object whose HashCode is same their equals() MAY BE true or false.
 */
