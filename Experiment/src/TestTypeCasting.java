
public class TestTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double d = 10.0;
		d = a;
		a = (int)d;
		long c = 51;
		short s1 = 1;
		short s2 = 1;
		short s3 = (short)(s1+s2);
		int age =10;
		if(age>18) {
			System.out.println("can vote");
		}else {
			System.out.println("not applicable");
		}

	}

}
