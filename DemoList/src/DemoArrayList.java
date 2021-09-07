import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {
	public static void main(String[] args) {
		//List li  = new ArrayList(); 		/* Dynamic polymorphism*/ /*legasy approach*/
		List<String> li  = new ArrayList<String>(); 		
		/*<> - is generic added in jdk 1.5*/
		/* List li = new list(); compilation error because it interface cant create object 
		 * Arrays can contain primitives
		 * Collection can contain ONLY objects
		 * ArrayList is just a array of references of class Object*/
		System.out.println(li.size());
		System.out.println(li.isEmpty());

		li.add("s");
		li.add("s");
		li.add("p");
		li.add("y");
		li.add("e");
//		li.add('c'); /* after adding <> this is compiler error because this is not string*/
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);

		String str = (String)li.get(5);
		
		/* int to Integer class type object is automatically happening
		 * When we try to add primitive it is automatically converted to it 
		 * respective wrapper object is called as "boxing" or "auto-boxing" 
		 * li.add("67") is an example of auto boxing
		 * for all 8 primitive type there are respective wrapper class
		 * All the wrapper class are n java.lang*/
//		li.add(67); /* affter adding <> this is compiler error because this is not string*/
//		int i = (int) li.get(6);
		/*The process of automatic conversion of primitive to respective wrapper object is called as boxing or auto-boxing
		 *The process of automatic conversion of respective wrapper to primitive is called as boxing or auto-boxing
		 */
		Integer iobj = 90; /* auto-boxing */
//		i = iobj; /* auto-unboxing */ 
//		i = (Integer)li.get(6); /*li.get() returns object type so we will have to down cast*/
		System.out.println(li.size());
		/* adding duplicate No problem
		 * Index starts with 0
		 */
		System.out.println(li.get(3));
		System.out.println(li.set(3,"Hsbc"));
		System.out.println(li.get(3));
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		System.out.println("----------------------------------------");
		System.out.println("Before removing ");
		System.out.println(li);
		System.out.println("----------------------------------------");

		li.remove(4);
		System.out.println("----------------------------------------");
		System.out.println("Afre removing ");
		System.out.println(li);
		System.out.println("----------------------------------------");
		
		System.out.println(li.indexOf("Hsbc"));
		li.clear();
		System.out.println(li.size());
		System.out.println(li.isEmpty());

	}
}
