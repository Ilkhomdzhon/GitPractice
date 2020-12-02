package com.syntax.java1;

import java.util.Scanner;

public class HomeWork020 {

	public static void main(String[] args) {
		
		 
		/*
		 * For you to do: 
Write a program that asks the user's age: "Enter your age  "
Then display it by adding 10 (i.e age + 10) in your final output. 

Example Output: 
Enter your age 30
Your age after 10 years is 40

		 */
		
		Scanner scan = new Scanner (System.in);
		
		 System.out.println("Please enter your age ");
		 
		  int age = scan.nextInt();
		  
		  System.out.println("Your age after 8 years "+(age+8));
		
		
		
	}

}
