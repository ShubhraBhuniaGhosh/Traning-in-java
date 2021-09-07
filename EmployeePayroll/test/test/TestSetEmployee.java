package test;

import java.util.HashSet;
import java.util.Set;

import com.hsbc.employeepayroll.entity.Manager;

public class TestSetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager(1, 10, "a");
		Manager m2 = new Manager(1, 10, "a");
		Set<Manager> s = new HashSet<Manager>();
		boolean result = s.add(m1);
		System.out.println(result);

		/* Here it add() is calling equals method of object
		 * If there is no equal methods in manager class or its super class i.e 
		 * Employees it will call the equals method of Object.
		 * equals() method of object  super class only checks if 2 references 
		 * are refrying to the same object or not and it is done simply by 
		 * using ==*/
		
		result = s.add(m2);
		System.out.println(result);
	}

}


/* Two objects which are EQUAl by equals() their HashCode MUST be same
 * Two object whose HashCode is same their equals() MAY BE true or false.
 * 
 */
