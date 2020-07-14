package com.syntax.java;

public class HomeWork121 {
	
//	For you to do:
//
//		Declare a static variable number that will hold an integer value:
//
//		Access number from the main method and assign value to it.
//		Create an Object of the class, access number in a nonstatic way and assing value of 200.
//
//		Print out number using class name and using instance
//
//		Expected Output:
//		200
//		200
	static int a ;
	
	public static void main(String[] args) {
		
		a=200;
		HomeWork121 on=new HomeWork121();
		
		on.a=200;
		
		System.out.println(a);
		System.out.println(on.a);
		
	}

}
