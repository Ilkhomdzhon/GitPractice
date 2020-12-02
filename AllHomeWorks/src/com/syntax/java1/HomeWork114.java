package com.syntax.java1;

public class HomeWork114 {
	
	/*
	 * Write a method header on line two with the following specs:    

Returns:
a String
Name:
spaceOut
Parameters:
a String

Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).

Examples:
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "

	 */
	
	public String spaceOut(String s ) {
		
		String space = "" ;
		
		for (int i=0;i<s.length();i++) {
			space = space+s.charAt(i);
			space=space+" ";
			
		}
		
		return space;
		
	}
		 public static void main(String[] args) {
			
			 
			 HomeWork114 met = new HomeWork114();
			 
			String g= met.spaceOut("Ishonkulov");
			 
				 System.out.println(g);
		}
	
}
