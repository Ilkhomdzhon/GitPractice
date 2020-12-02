package com.syntax.java1;

public class HomeWork111 {

	
	/*
	 * Create a method that will accept a String as a parameter and return new String all in upper case

			Call method

		Expected Output:
				TEST
	 */
	
		 String test(String a) {
			 
			 a=a.toUpperCase();
			 
			 return a ;
			 
		 
		 }
		 public static void main(String[] args) {
			
			 HomeWork111 met = new HomeWork111();
			 
			 System.out.println(met.test("test"));
			
		}
		 
}
