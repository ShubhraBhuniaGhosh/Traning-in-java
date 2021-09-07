package com.hsbc.usermanagement.test;
import com.hsbc.usermanagement.entity.Address;
import com.hsbc.usermanagement.entity.User;
import java.util.Scanner;
//import java.lang.*;  //it is present by default

// Always import one by one never use *;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Address userAddress = new Address("Bikaner", 334001);
				
		
		User user=new User(10,"Shubu", userAddress);
//		User new_user= new User();
		//user.id=-10;
		
//		System.out.println("Please enter id: ");
//		int id=sc.nextInt();
//		user.setId(id);
		user.display();
		
		sc.close();
		
	}

}