package com.syntax.java;

import java.util.Scanner;

public class HW33 {

	public static void main(String[] args) {
//		For you to do:
//
//			Ask the user to enter any number
//			if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd"
//			If the number if even then check if it is greater than 1000 or not.
//			If the number is greater than 1000, then print "Even value is large", else print "Even value is just right". 
//
//			Example Output:
//			Please enter a number
//			Value is odd
//
//			Example Output:
//			Please enter a number
//			Value is even
//			Even value is just right
//
//			Example Output:
//			Please enter a number
//			Value is even
//			Even value is large

		  Scanner scan=new Scanner (System.in);
		  System.out.println("Enter any number ");
		  int num=scan.nextInt();
		  
		   if (num%2==0) {
			   System.out.println("Value is even");
           
            if (num>=1000)    {
            	System.out.println("Even value is large");
            	
            	
            }
		   
		   } if (num%3==0) {
			   System.out.println("Value is odd");
		   
		   } else if  (num<=1000) {
       		System.out.println("Even value is just right");
       	}
		 
		
	}

}
