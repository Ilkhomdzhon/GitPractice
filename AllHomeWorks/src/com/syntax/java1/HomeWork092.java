package com.syntax.java1;

import java.util.Scanner;

public class HomeWork092 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * Using Scanner class input string value. Print out the following:
		 * "The first 3 letters of ___ is ___"
		 * 
		 * For example, if the input is "banana", your output should be:
		 * "The first 3 letters of banana is ban".
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		
		String word = scan.next();
		
		String output=word.substring(0, 4);
		
			 System.out.println("The first 3 letter of  "+word+" is " +output);

	}

}
