package com.syntax.REVIEW;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */

		Scanner scan = new Scanner (System.in);
	  
		 int num1 , num2 ,num3 ;
		 int greatest = 0;
		 
		 
		 	 System.out.println("Enter 1st number ");
		 	 num1 = scan.nextInt();
		 	 
		 	 System.out.println("Enter 2nd number ");
		 	 num2 = scan.nextInt();
		 	 
		 	 System.out.println("Enter 3rd number");
		 	 num3 = scan.nextInt();
		 	 
		 	 if (num1 > num2 && num1 > num3) {
		 		 greatest = num1;
		 		 
		 	 }else if (num2 >num1 && num2 >num3) {
		 		 greatest = num2;
		 		 
		 	 }else if (num3 > num1 && num3 > num2) {
		 		 
		 		 greatest = num3;
		 		 
		 	 }
		 	 System.out.println("Greatest number is  "+greatest);
		
		
		
		
	}

}
