package com.syntax.java;

import java.util.Scanner;

public class HW94 {

	public static void main(String[] args) {
//		For you to do:
//
//			You have Scanner class to input string value. 
//
//			If language is Java it should print the: 
//			"Java is a programming language".
//
//			If language is C it should print the:
//			"C is a procedural programming language"
//
//			If language is C++ it should print the:
//			"C++ is a middle-level programming language"
//
//			If any other should print:
//			"Doesn't match any programming language"

		String language;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter any programming language");
		language=scan.nextLine();
		 
		if (language.equalsIgnoreCase("Java")) {
			language="Java is a programming language";
			
		}else if (language.equalsIgnoreCase("C")) {
			language="C is a procedural programming language";
		}else if (language.equalsIgnoreCase("C++")) {
			language="C++ is a middle-level programming language";
			
		}else  {
			language="Doesn't match any programming language";
		}
		
              System.out.println(language);
		
		
	}

}
