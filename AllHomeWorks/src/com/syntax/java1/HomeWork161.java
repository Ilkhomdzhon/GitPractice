package com.syntax.java1;

public class HomeWork161 {
	
	
	/*
	 * For you to do:

Overload 2 final instance methods:

Call them in main method

Expected Output:
Final method with boolean parameter
Final method with String parameter
	 */
	
	
	public final void bool(boolean a) {
		System.out.println("Final method with boolean parameter");
		
	}
	
	public final void string(String b) {
		System.out.println("Final method with String parameter");
	}
	
	public static void main(String[] args) {
		
		HomeWork161 obj = new HomeWork161();
		obj.bool(false);
		obj.string("");
		
	}

}
