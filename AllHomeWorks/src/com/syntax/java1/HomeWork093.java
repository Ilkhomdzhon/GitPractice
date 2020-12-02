package com.syntax.java1;

import java.util.Scanner;

public class HomeWork093 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * You have Scanner class to input string value.
		 * 
		 * If language is Java it should print the: "Java is a programming language".
		 * 
		 * If language is C it should print the:
		 * "C is a procedural programming language"
		 * 
		 * If language is C++ it should print the:
		 * "C++ is a middle-level programming language"
		 * 
		 * If any other should print: "Doesn't match any programming language"
		 * 
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Name the programming language");
		String word = scan.next();
		
		if (word.equalsIgnoreCase("Java")) {
			
			word ="Java is a programming language";
			
		}else if (word.equalsIgnoreCase("C")) {
			
			word = "C is a procedural programming language";
			
		}else if (word.equalsIgnoreCase("C++")) {
			
			word = "C++ is a middle-level programming language";
			
		}else {
			
			word = "Doesn't match any programming language";
			
		}
		
		 System.out.println(word);
		
	}

}
