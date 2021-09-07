
public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {// here we write all doubtful statements this is also called as guarded region.	
//			System.out.println("I will be printed");
//			System.out.println(args[0]);
//			System.out.println(2/0);// This is a doubtful statement
//			System.out.println("I will not be printed");
//		}
//		//No statement can appear between try and catch any attempt to do so generates compilation error
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			//Try to rectify and/or give user friendly message to the user
//			System.out.println(e.toString());
//			System.out.println("Cannot devide by 0");
//			e.printStackTrace();// Always include this so that we can know which part/line has generated an exception
//		}
//		catch(ArrayIndexOutOfBoundsException e) { 
//			e.printStackTrace();
//		}
//		System.out.println("I might not be printed");
//______________________________________________________________________________________________________________________________
//
		try {
			System.out.println("I will be printed");
			System.out.println(args[0]);
			System.out.println(2/0);
			System.out.println("I will not be printed");
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) { 
			e.printStackTrace();
		}
		catch (Exception e) {	// Exception is the super class of all other exceptions. 
			//So this catch block is capable of handling any kind of exception
			System.out.println("Something went wrong please try again");
			e.printStackTrace();
		}finally{
			//finally block will always execute
			//In finally block you write statements which must always execute 
			//Example: releasing the resources such as files, database connections
			//
			System.out.println("I will 100% be printed, even if you put a return in the catch");
		}
		System.out.println("I might not be printed");
//______________________________________________________________________________________________________________________________
//		
//		try {
//			System.out.println("I will be printed");
//			System.out.println(args[0]);
//			System.out.println(2/0);
//			System.out.println("I will not be printed");
//		}finally {
//			System.out.println("I will 100% be printed, even if you put a return in the catch");
//		}
//______________________________________________________________________________________________________________________________
//		
	}

}

/*
 * valid combinations
 * 1. try{}
 * 	  catch(){} 
 *  
 * 2. try{}
 * 	  catch(){}
 * 	  catch(){} 
 * 
 * 3. try{}
 * 	  catch(){} 
 * 	  finally{}
 * 
 * 4. try{}
 * 	  catch(){}  
 * 	  catch(){}
 *    finally{}
 * 
 * 5. try{}
 *    finally{}
 *    
 *    
 *  only try or only catch or only finally not possible
*/