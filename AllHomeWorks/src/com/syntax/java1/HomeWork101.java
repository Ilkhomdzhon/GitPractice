package com.syntax.java1;

public class HomeWork101 {

	/*
	 * Create a class 'Main' (please do not make it public as Repl will give you an
	 * error) Inside class String variable 'name' and integer variable 'roll_no'.
	 * 
	 * Creating an object of the class and assign the value of 2 to roll_no and
	 * value of "John" to name
	 * 
	 * Your program should print the following: 
	 * Name is John and roll number is 2
	 */

	
	public void method(String name , int roll_no) {
		
		System.out.println("Name is "+name+" and roll number is "+roll_no);
	}
	
	public static void main(String[] args) {
		
		HomeWork101 met = new HomeWork101();
		
		met.method("John", 2);
		
		
	}
}
