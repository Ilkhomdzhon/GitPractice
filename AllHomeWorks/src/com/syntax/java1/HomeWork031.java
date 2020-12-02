package com.syntax.java1;

import java.util.Scanner;

public class HomeWork031 {

	public static void main(String[] args) {
		
		/*
		 * For you to do: 
Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"

You have 2 conditions:
If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"

Example Output: 
Please enter your gender: M or F
Please enter your age
Man

Example Output: 
Please enter your gender: M or F
Please enter your age
Boy

Example Output: 
Please enter your gender: M or F
Please enter your age
Woman

Example Output: 
Please enter your gender: M or F
Please enter your age
Girl
feedback
use if else structure onl
		 */
		
		Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Please enter your gender");
		 String gender = scan.next();
		 System.out.println("Please enter your age");
		 int age = scan.nextInt();
		 
		 if (gender.equalsIgnoreCase("M") && age >= 18 ) {
			 System.out.println("Man");
		 }else if (gender.equalsIgnoreCase("M") && age <18) {
			 System.out.println("Boy");
		 }else if (gender.equalsIgnoreCase("F") && age >= 18) {
			 System.out.println("Woman");
		 }else if (gender.equalsIgnoreCase("F") && age <18) {
			 System.out.println("Girl");
		 }
		
		

	}

}
