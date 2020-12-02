package com.syntax.java1;

public class HomeWork153 {

	/*
	 * For you to do:
	 * 
	 * Overload instance method display by having different types of parameters
	 * Inside each method write the logic to print value of the parameter
	 * 
	 * Call all methods inside your main method
	 * 
	 * Expected Output: 100 Syntax Technologies 100.09
	 * 
	 */

	int num;
	String schoolName;
	double number;

	public void m1(int num) {
		System.out.println(num);
	}

	public void m1(String schoolName) {
		System.out.println(schoolName);
	}
	public void m1(double number) {
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		
		HomeWork153 obj = new HomeWork153();
		
		obj.m1(100);
		obj.m1("Syntax Technologies");
		obj.m1(100.99);
	}

}
