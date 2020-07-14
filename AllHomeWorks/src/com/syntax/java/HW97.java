package com.syntax.java;

import java.util.Scanner;

public class HW97 {

	public static void main(String[] args) {
		
//		Write code that will take in a String input and check to see if it is a palindrome or not.
//
//		A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
//
//		Examples of palindromes:
//		racecar
//		was it a car or a cat I saw
//		never odd or even
//		rats live on no evil star
//
//		Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
//
//		Your program will print out "true" if it's a palindrome and "false" if not.
//		
		Scanner scan=new Scanner (System.in);
		System.out.println("Input");
		String given=scan.nextLine();
		given=given.replaceAll(" ", "");
		String str="";
		boolean t=true;
		boolean f=false;
		
		
		for (int i=given.length()-1;i>=0;i--) {
			str=str+given.charAt(i);
			
			if (str.equalsIgnoreCase(given)) {
				System.out.println(t);
			}else {
				System.out.println(f);
			}
		}
		
	}

}
