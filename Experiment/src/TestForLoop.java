
public class TestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i = 1; i<=5; i++) {
			System.out.println(i);
		}

//		for(int i = 1; i<=5; i++) {
//			System.out.println(i);
//		}

		
		//Both are same
		
		for(i = 1; i<=5; i++) {
		}
		System.out.println(i);
		
		for(i = 1; i<=5; i++);
		System.out.println(i);
	}

}
