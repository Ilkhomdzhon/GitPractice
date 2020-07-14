package com.syntax.java;

import java.util.Scanner;

public class HW32 {

	public static void main(String[] args) {
//		For you to do: 
//			Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"
//
//			You have 2 conditions:
//			If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
//			If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
//
//			Example Output: 
//			Please enter your gender: M or F
//			Please enter your age
//			Man
//
//			Example Output: 
//			Please enter your gender: M or F
//			Please enter your age
//			Boy
//
//			Example Output: 
//			Please enter your gender: M or F
//			Please enter your age
//			Woman
//
//			Example Output: 
//			Please enter your gender: M or F
//			Please enter your age
//			Girl
		String gender;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your gender M or F");
		gender=scan.next();
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		if (age>=25 && gender.equalsIgnoreCase("M")) {
			System.out.println("Man");
			
			
		} if (age<25 && gender.equalsIgnoreCase("M")) {
			System.out.println("Boy");
		
		}if (age>=25 && gender.equalsIgnoreCase("F")) {
			System.out.println("Women");
		
		}if (age<25 && gender.equalsIgnoreCase("F")) {
			System.out.println("Girls");
		}
		

	}

}
