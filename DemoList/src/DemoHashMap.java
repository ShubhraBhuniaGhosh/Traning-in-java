import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		/* its a map 
		 * using hashing
		 * Map is an interface and HashMap is implementing
		 * any object type we are using in map as key must implement hasCode and 
		 * equals method appropriately
		 */
		
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.put(" huijhnj", 87));
		System.out.println(m.put(" huijhnj", 87));
		System.out.println(m.get("A"));

		m.put("A", 12);
		m.put("p", 1);
		m.put("t", 2);
		m.put("b", 12); /*Duplicate value is allowed but duplicate key is not allowed */
		m.put(null, null);
		m.put("p", 10);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get("A"));
		System.out.println(m.remove("B"));
		System.out.println(m.containsValue(5));
		
		// Explore treeMap and  
		

	}

}
