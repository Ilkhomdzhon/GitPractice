package com.syntax.java1;

import java.util.Scanner;

public class HomeWork033 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the largest number among three distinct numbers using
		 * nested if condition Please use Scanner class to take input from users
		 * 
		 * Expected Output: Please enter 3 distinct numbers The largest number is 14
		 */

		
		  	Scanner scan =new Scanner (System.in);
		  	System.out.println("Please enter number-1 ");
		  	int num1 = scan.nextInt();
		  	
		  	System.out.println("Please enter number-2 ");
		  	int num2 = scan.nextInt();
		  	
		  	System.out.println("Please enter number-3 ");
		  	int num3 = scan.nextInt();
		  	
		  	if (num1 >num2 && num1 > num3) {
		  		System.out.println("The greates is "+num1);
		  	}else if (num2>num1 && num2>num3) {
		  		System.out.println("The greates is "+num2);
		  	}else if (num3>num1 && num3>num2) {
		  		System.out.println("The greates is "+num3);
		  	}
		  	
		
		
	}

}
