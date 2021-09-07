
public class DemoString {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// String object can be created as in the below mentioned ways
//		// we can make string without  using new keyword (storage way can change)
//		String str = "Hsbc"; // String is a class and is from lang package
//		String project = new String("Full Stack");
//		
//		// none of these operation in print statement will effect the original string
//		// this also puts load on the machine
//		System.out.println(str.length());
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
//		System.out.println(str.charAt(1));
//		System.out.println(str.concat(" India")); // explicitly calling concat 
//		System.out.println((str+" India   ").length()); // using + overloading 
//		System.out.println((str+" India   ").trim().length()); // remove the spaces after india
//		// helps if user inputs only space and nothing else
//		
//		System.out.println(str.substring(0,2));
//		// gives a part of the sting starting from 0 and including 0 and not including 2
//		System.out.println(str.substring(1));
//		System.out.println(str);
//		System.out.println(str.startsWith("I"));
//		System.out.println(str.endsWith("c"));
//		System.out.println(str.contains("SB"));
//		System.out.println(str.equals("hsbc"));
//		System.out.println(str.equalsIgnoreCase("hsbc"));
//
//		// strings are actually immutable every time we change it creates a new object with mutation. 
//		// Know theses basic functions
//		
//		String name = "HSBC India";
//		System.out.println(name.split(" "));
//		String [] arr = name.split(" ");
//		
//		for(String i: arr) {
//			System.out.println(i);
//		}
//		
//		
		String s1 = new String("hi");
		String s2 = new String("hi");
		System.out.println(s1==s2);
		
		// to check any 2 object have same content or not we must use equals object.
		
		System.out.println(s1.equals(s2));
		
		// In this 
		String s3 = "HSBC";
		String s4 = "HSBC";
		System.out.println(s3==s4); // This is taking the reference from string constant pool 
		
		//suppose s3 and s4 are created by 2 different people using "" and have same value then 
		//both will refer to same object and if person 1 changes s3 and string is mutable then 
		//s4 will also change. Hence string is immutable. 
		
	}
}
