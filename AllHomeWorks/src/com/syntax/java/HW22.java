package com.syntax.java;

import java.util.Scanner;

public class HW22 {

	public static void main(String[] args) {
		
//		For you to do:
//			Write a program to take user name, age and mobile number
//
//			First Output: "Enter your name"
//			Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
//			Third Output: "Enter your age"
//
//			Example Output: 
//			Enter your name
//			Enter your mobile number
//			Enter your age
//			Your name is Weqas, your age is 45 and your mobile number is 571-339-9999
		String name ;
		int age ;
		String phone;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		name=scan.nextLine();
		
		System.out.println("Enter your mobile number");
		phone=scan.nextLine();
		
		System.out.println("Enter your age");
		age=scan.nextInt();
		
		
System.out.println("Your name is "+name+","+"your age is "+age+" "+"and your mobile number is "+phone);
		
		


		
	}

}
