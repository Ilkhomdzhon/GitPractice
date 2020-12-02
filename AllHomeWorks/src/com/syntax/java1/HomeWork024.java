package com.syntax.java1;

import java.util.Scanner;

public class HomeWork024 {
	
	
	public static void main(String[] args) {
		
		/*
		 * Instructions from your teacher:
For you to do:
Write a program that takes a user's name and prints it. 

Example Output:
Hello, please enter your name
Your name is Sumair


		 */
		
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Hello , please enter your name ");
		  String name = scan.next();
		  
		  System.out.println("Your name is "+name);
	}

}
