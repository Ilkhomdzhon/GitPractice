package com.syntax.java;

import java.util.Scanner;

public class HW24 {

	public static void main(String[] args) {
//		For you to do:
//			Write a program that takes a user's name and prints it. 
//
//			Example Output:
//			Hello, please enter your name
//			Your name is Sumair
		String name ;

		Scanner scan=new Scanner(System.in);
		System.out.println("Hello ,please enter your name ");
		name=scan.nextLine();
		
		System.out.println("Your name is "+name+".");
		
	}

}
