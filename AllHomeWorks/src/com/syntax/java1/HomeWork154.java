package com.syntax.java1;

public class HomeWork154 {
	
	
	/*
	 * Overload private instance method m1

Call each method from the main method. 
 
Expected Output:
private m1 method 
private m1 method with int parameter
	 */

	
	private void m1() {
		System.out.println("private m1 method ");
		
	}
	
	private void m1 (int num1) {
		System.out.println("private m1 method with int parameter");
		
	}
	public static void main(String[] args) {
		
		HomeWork154 obj = new HomeWork154();
		obj.m1();
		
		obj.m1(12);
		
		
	}
	
}
