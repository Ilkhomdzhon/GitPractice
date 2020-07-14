package com.syntax.java;

import java.util.Scanner;

public class HW21 {

	public static void main(String[] args) {
//		
//		For you to do: 
//			Write a program that asks the user's age: "Enter your age  "
//			Then display it by adding 10 (i.e age + 10) in your final output. 
//
//			Example Output: 
//			Enter your age 30
//			Your age after 10 years is 40
//
		int age; 
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter your age ");
		age=scan.nextInt();
		
		System.out.println(age);
		System.out.println("Your age after 10 years is "+(age+10));
		
//		
	}

}
