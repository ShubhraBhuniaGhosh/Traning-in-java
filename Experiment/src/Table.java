import java.util.Scanner;

public class Table {
	
	void tablePrint(int num) {
		for(int i = 1; i<=10; i++) {
			System.out.println(num + " X "+ i+ " = "+ i*num);
		}
	}
	
	void tablePrint1to10() {
		for(int j = 1; j<=10; j++)
			for(int i = 1; i<=10; i++) {
				System.out.println(j + " X "+ i+ " = "+ i*j);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter");
//		int num = sc.nextInt();
//		
		Table t = new Table();
//		t.tablePrint(num);
		
		t.tablePrint1to10();
		
//		for(int i = 1; i<=10; i++) {
//			t.tablePrint(i);
//			System.out.println();
//		}
		
	}
}
