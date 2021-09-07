
import java.util.Scanner;


public class CheckPrime {

	boolean prime(int num) {
		if(num == 2) {
			return true;
		}
		//for(int i=2; i<n/2; i++) 
		for(int i=2; i<=java.lang.Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int num = sc.nextInt();
		CheckPrime t = new CheckPrime();
		if(t.prime(num)) {
			System.out.println("prime");
		}else {
			System.out.println("Not prime");
		}
		
		sc.close();

	}

}
