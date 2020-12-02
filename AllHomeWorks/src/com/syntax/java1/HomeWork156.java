package com.syntax.java1;

public class HomeWork156 {

	/*
	 * Overload Constructor of the Main class
	 * 
	 * Create 2 Objects of Main class to execute both constructors
	 * 
	 * Expected Output: Welcome to the Syntax I am the student at Technologies
	 */

	public void m1() {
		System.out.println("Welcome to the Syntax ");

	}

	public void m1(String schoolName) {
		System.out.println("I am the student at " + schoolName);
	}

	public static void main(String[] args) {

		HomeWork156 obj = new HomeWork156();
		
		obj.m1();
		obj.m1("Technologies");

	}
}
