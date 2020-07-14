package com.syntax.java;

import java.util.Scanner;

public class HW77 {

	public static void main(String[] args) {
//		
//		For you to do:
//			Create an array of integers that will store 5 elements taken from a user
//			Don't print any prompt message for the user
//			Then print out all the elements you have created in the first loop in reverse order. 
//
//			Example: 
//			Input: 
//			1
//			2
//			3
//			4
//			5
//			Output:
//			5
//			4
//			3
//			2
//			1
	
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter 5 numbers");
	int[]num=new int[10];
	
	for (int i=0;i<num.length;i++) {
		num[i]=scan.nextInt();
		
	}
	for (int i=num.length-1;i>=0;i--) {
		System.out.println(num[i]);
	}
	
	
	
		 
		
	}

}
