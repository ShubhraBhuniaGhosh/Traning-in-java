import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
	public static void main(String[] args) {
		Set<String> li  = new HashSet<String>(); 		/* Dynamic polymorphism*/
		/* set is not ordered 
		 * list is ordered but not sorted (by default)
		 * java.lang.object has equals method in it*/
//		System.out.println(li.size());
//		System.out.println(li.isEmpty());
		boolean result = li.add("s");
		System.out.println();
		System.out.println(result);
		result = li.add("s");  /* String-equals() would be called internally to 
								check before adding if this element is already present*/
		System.out.println(result);

		li.add("s");
		li.add("s"); /* not added as duplicate not allowed*/
//		li.add('s');
		li.add("p");
		li.add("y");
		li.add("e");
//		li.add('c');

		int i = 67;
//		li.add(i);
//		int i = (int) li.get(6);

		Integer iobj = 90; /* auto-boxing */
//		i = iobj; /* auto-unboxing */
//		i = (Integer)li.get(6); /*li.get() returns object type so we will have to down cast*/
		System.out.println(li.size());
		
//		System.out.println(li.get(3));
//		System.out.println(li.set(3,"Hsbc"));
//		System.out.println(li.get(3));
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		System.out.println("----------------------------------------");
		System.out.println("Before removing ");
		System.out.println(li);
		System.out.println("----------------------------------------");

		li.remove(4); /* it is searching 4 in the set and removing if found*/
		System.out.println("----------------------------------------");
		System.out.println("Afre removing ");
		System.out.println(li);
		System.out.println("----------------------------------------");
		
//		System.out.println(li.indexOf("Hsbc"));
		li.clear();
		System.out.println(li.size());
		System.out.println(li.isEmpty());

	}
}
