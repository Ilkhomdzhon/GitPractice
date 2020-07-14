package com.syntax.java;

import java.util.Scanner;

public class HW34 {

	public static void main(String[] args) {
//		Write a program to find the largest number among three distinct numbers using nested if condition
//		Please use Scanner class to take input from users
//
//		Expected Output:
//		Please enter 3 distinct numbers
//		The largest number is 14
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter 1st number ");
		int num1 =scan.nextInt();
		
		System.out.println("Enter 2nd number ");
		int num2 =scan.nextInt();
		
		System.out.println("Enter 3rd number ");
		int num3=scan.nextInt();
		
		 if (num1>num2 && num1>num3) {
			 System.out.println("The largest number is "+num1);
		
		 }if (num2>num1 && num2>3) {
			System.out.println("The largest number is "+num2);
			
		 }if (num3>num1 && num3>num2) {
				System.out.println("The largest number is "+num3);
			
			
		
		 }
		 
		
		
		
	}

}
