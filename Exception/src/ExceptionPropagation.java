import java.io.IOException;

public class ExceptionPropagation {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		display();
//		System.out.println("In main I might get printed");
		
		/*when there is an exception object of the type of exception is 
		 * created and is thrown and then the catch block catches it
		 */
		
		/*Both are subclass of runtime exception 
		 * (runtime exception is also called as "unchecked exception" and
		 * non-runtime exception is also called as "checked exception" and )
		 * it is no mandate to handle with subclass of runtime exception
		 * but is mandatory to handle non subclass of runtime exception 
		 * or declared to be thrown means throws.
		 * If you don't perform either of theses complier is not happy
		 */
//		throw new ArithmeticException();	/*it works and compiles*/
//		throw new NullPointerException();
		
//		throw new IOException();
//		throw new Exception();
		
	}
	
	static void display(){
		// TODO Auto-generated method stub
//		try {
//			show();
//		}catch (ArithmeticException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println("In display");
//		}
//		System.out.println("In display I might get printed");
		/*
		 * Any function having un-handled "checked exception" 
		 * must declare that it might throw a "checked exception"  
		 */
//		throw new IOException();

	}
	
	static void show() {
		// TODO Auto-generated method stub
		try {
			System.out.println(2/0);
		}
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		finally {
			
		}
	}

}
