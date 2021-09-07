package test;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.entity.HR;
import com.hsbc.employeepayroll.entity.Manager;

public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o = getEmployee(); // up casting, implicit // getEmployee is written by some other team
		// at compile time we don't know what object will be return by that method at run time
		Employee e = (Employee)o;// Reference variable casting
		//Down casting - > reference of super type converted to sub type
		// Down casting is always explicit and a risk throws java.lang.ClassCastException 
		
		if(e instanceof HR) { // instanceof is an operator
			HR m = (HR) e;
		}
		System.out.println(((Employee)e).calculateSalary());
		System.out.println(e.calculateSalary());
		System.out.println(e.calculateSalary());
		System.out.println(e.calculateSalary());
		
		
	}
	
	
	public static Employee getEmployee() {
		//based on some condition we will be returning 
		//Either Manager object or HR object
		
		int a = 2;
		if(a==2) {
			return new Manager();
		}else {
			return new HR();
		}
		
	}

}
