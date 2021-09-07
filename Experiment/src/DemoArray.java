import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a; // this one is recommended
		int d [];
		
		int [] numbers;  // array declaration
		// and always write is like   int [] numbers = null; 
		numbers  = new int [3];  // array instantiation or construction
		// Array are treated as objects in java
		
//		for(int i = 0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = 100; // initialization  
		}
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		// This is called enhanced for loop or For-in loop or for-each loop
		// It is for when ever you want sequential access.
		// In this type of loop i has to be declared inside the loop
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		// 2nd way of crating arrays
		
		// All 3 together (array declaration , instantiation, initialization 
		
		int [] marks = {90, 95, 98};
		
		System.out.println(marks.length);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of students:");
		int students = sc.nextInt();
		
		System.out.println("Enter no of subjects:");
		int subjects = sc.nextInt();
		
		int [][] studentMarks = new int[students][subjects];
		
		for(int student = 0; student<studentMarks.length; student++) {
			System.out.println("Enter marks of Student "+ (student+1));
			for(int subject = 0; subject<studentMarks[student].length; subject++) {
				System.out.println("subject " + (subject+1) + " : ");
				studentMarks[student][subject] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int student = 0; student<studentMarks.length; student++) {
			System.out.println("Marks of Student " + (student+1));
			for(int subject = 0; subject<studentMarks[student].length; subject++) {
				System.out.println("subject " + (subject+1) + " : " + studentMarks[student][subject]);
			}
			System.out.println();
		}
		
		
		
	}

}
