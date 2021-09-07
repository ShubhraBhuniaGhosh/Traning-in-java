import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> s = new HashSet<Integer>();  /*this is unordered, unsorted*/
		Set<Integer> s = new TreeSet<Integer>();	/*sorted and ordered by sorting*/
		s.add(56);
		s.add(94);
		s.add(35);
		s.add(1);
		System.out.println(s.add(56));

	}

}
