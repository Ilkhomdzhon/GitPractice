package com.syntax.java1;

public class HomeWork155 {

	/*
	 * Overload static method and then execute both overloaded methods.
	 * 
	 * Expected Output: static method without parameter static method with int
	 * parameter
	 * 
	 */

	public static void m1() {
		System.out.println("static method without parameter");
	}

	public static void m1(int number) {
		System.out.println("static method with int parameter");

	}
	
	public static void main(String[] args) {
		
		HomeWork155 obj = new HomeWork155();
		obj.m1();
		obj.m1(23);
		
	}

}
