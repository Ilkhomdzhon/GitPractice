package com.syntax.java;

import java.util.Scanner;

public class HW92 {

	public static void main(String[] args) {
		
//		For you to do:
//
//			Using Scanner class input string value. 
//			Print out the following: "The first 3 letters of ___ is ___"
//
//	For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

		Scanner scan=new Scanner (System.in);
		System.out.println("Enter word");
		String word=scan.next();
		System.out.println(word.substring(0, 3));
		
		
	}

}
