package com.syntax.java;

import java.util.Scanner;

public class HW23 {

	public static void main(String[] args) {
//		For you to do:
//			Create a program that will ask a user to input boolean value "Input the boolean value"
//			If the input is true or false, then the output should look like below: 
//
//			Example Output: 
//			Input the boolean value
//			The value is true
//
//			Example Output: 
//			Input the boolean value
//			The value is false
		boolean isTrue=true;
		boolean isFalse=false;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input the boolean value");
		isTrue=scan.nextBoolean();
		
		System.out.println("The value is "+isTrue);
		
		System.out.println("Input the boolean value");
		isFalse=scan.nextBoolean();
		
		
		System.out.println("The value is "+isFalse);
		
	}

}
