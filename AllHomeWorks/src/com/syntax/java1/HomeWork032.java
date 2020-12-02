package com.syntax.java1;

import java.util.Scanner;

public class HomeWork032 {

	public static void main(String[] args) {

		/*
		 * Ask the user to enter any number if a user enters a number and it is even,
		 * print "Value is even", otherwise print "Value is odd" If the number if even
		 * then check if it is greater than 1000 or not. If the number is greater than
		 * 1000, then print "Even value is large", else print
		 * "Even value is just right".
		 * 
		 * Example Output: Please enter a number Value is odd
		 * 
		 * Example Output: Please enter a number Value is even Even value is just right
		 * 
		 * Example Output: Please enter a number Value is even Even value is large
		 */

			
		 Scanner scan = new Scanner (System.in);
		System.out.println("Please enter number ");
		int num = scan.nextInt();
		
		if (num%2 == 0) {
			System.out.println("Value is even");
		} if (num >= 1000) {
			System.out.println("Even value is large");
		} else if (num< 1000 ) {
			System.out.println("Even value is just right");
		}
		
		else {
			System.out.println("Value is odd");
		}
		
	}

}
