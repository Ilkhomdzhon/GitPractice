package com.syntax.java;

public class HomeWork125 {
	
//	Create a static method with the following specification
//
//	Return Type: String
//	Method Name: mixString
//	Parameters:
//	a String called s1
//	a String called s2
//
//	Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.  
//
//	NOTE: s1 and s2 should be of equal lengths:
//
//	s1 ==> "12345"
//	s2 ==> "abcde"
//	mixString(s1,s2) ==> "1a2b3c4d5e"
//	
	String firstValeu, secondValue;
	
		public static String mix(String s1, String s2) {
			String str ="";
			
			for (int i=0; i<s1.length();i++) {
				
			
			str=str+s1.charAt(i);
			str=str+s2.charAt(i);
			
		}
		return str;
}

		public static void main(String[] args) {
			String firstValue = mix("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue =  mix("howdy","hello");
			System.out.println(secondValue); 
		}
	
}
