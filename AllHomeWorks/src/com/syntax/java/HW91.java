package com.syntax.java;

public class HW91 {

	public static void main(String[] args) {
		
//		For you to do:
//
//			Create a String given="I love Java classes at Syntax"
//			Retrieve 2 Strings from given String and print them 
//
//			Expected Output:
//			classes at Syntax
//			I love Java
		
		String given="I love Java classes at Syntax";
		

	 String subString1 = given.substring(given.indexOf('c'));
			String subString2 = given.substring(given.indexOf('I'), given.indexOf('c')).trim();
			System.out.println(subString1);
			System.out.println(subString2);
		
		

		
		
	}

}
