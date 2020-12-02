package com.syntax.REVIEW;

import java.util.Scanner;

public class Example8 {
	
	public static void main(String[] args) {
		
		
		/*
		 * Create a program to ask a user to apply for credit card for 10 times ,
		 * ask soon as reaches yes stop asking;
		 */
		
		Scanner  scan = new Scanner (System.in);
		
			 for (int i=1;i<=10;i++) {
			 System.out.println("Apply for Credit Card ");
			  String apply =scan.next();
			  if (apply.equalsIgnoreCase("yes")) {
				  System.out.println("You got that Congrats");
				  break;
				  
			  }
			 
			 }
			 
			
			 
			 
		
	}

}
