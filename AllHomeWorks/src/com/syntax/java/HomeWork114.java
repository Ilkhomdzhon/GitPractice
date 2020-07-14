package com.syntax.java;

public class HomeWork114 {
	
//	Write a method header on line two with the following specs:    
//
//		Returns:
//		a String
//		Name:
//		spaceOut
//		Parameters:
//		a String
//
//		Then complete the method by programming the following behavior
//		Insert spaces after every character in the String s, then return the new string.
//		See below examples (note the space at the end as well).
//
//		Examples:
//		spaceOut("hello") ==> "h e l l o "
//		spaceOut("technology") ==> "t e c h n o l o g y "
	
	String spaceOut(String s) {
		String space=" ";
		for (int i=0;i<s.length();i++) {
			space=space+s.charAt(i);
		     space+=" ";
		}
		return s;
		
		
	}
	public static void main(String[] args) {
		
		HomeWork114 obj=new HomeWork114();
		
		System.out.println(obj.spaceOut("hello"));
		System.out.println(obj.spaceOut("technology"));
		
	}

}
