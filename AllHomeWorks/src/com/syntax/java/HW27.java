package com.syntax.java;

import java.util.Scanner;

public class HW27 {

	public static void main(String[] args) {
//		For you to do:
//			Write a Java program to ask age "Please enter your age". 
//			Based on the age define whether the user is eligible to vote or not.
//
//  A person who is eligible to vote must be older or equal to 18 years old and the program will show 
 //.
//			Otherwise, the program will show "You are not eligible to vote".
//
//			Examples:
//			Please enter your age 18
//			You are eligible to vote
//			Please enter your age 16
//			You are not eligible to vote
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age ");
		int age =scan.nextInt();
		
		if (age>18 || age==18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote");
		}
		

	}

}
