package com.syntax.java1;

import java.util.Scanner;

public class HomeWork021 {

	public static void main(String[] args) {

		/*
		 * For you to do: Write a program that takes user's first name and surname and
		 * prints in console Instruct the user to enter first name:
		 * "Please Enter First Name" Capture the first name Instruct the user to enter
		 * surname:"Please Enter Surname" Capture surname Print first name and surname
		 * 
		 * Final Output: Example: Please Enter First Name Please Enter Surname Cindy
		 * Crawford
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your name ");
		 String name= scan.next();
		 
		 System.out.println("Please enter your Surname ");
		 String surname= scan.next();
		 
		 System.out.println(name +" "+surname);
		 

	}

}
