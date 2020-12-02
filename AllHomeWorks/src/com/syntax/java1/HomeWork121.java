package com.syntax.java1;

public class HomeWork121 {
	
	/*
	 * For you to do:

Declare a static variable number that will hold an integer value:

Access number from the main method and assign value to it.
Create an Object of the class, access number in a nonstatic way and assing value of 200.

Print out number using class name and using instance

Expected Output:
200
200
	 */

	static int num ;
	
	public static void main(String[] args) {
			
		HomeWork121.num=200;
		
		HomeWork121  obj = new HomeWork121();
		obj.num=200;
		
		System.out.println(HomeWork121.num);
		
			 System.out.println(obj.num);
	}
	
}
