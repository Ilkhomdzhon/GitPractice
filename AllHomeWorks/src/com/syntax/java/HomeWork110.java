package com.syntax.java;

public class HomeWork110 {
	
//	For you to do :
//
//		Step1: Create three methods that will accept 2 in parameters on integer type
//		Step2: Write the logic in methods to perform actions below:
//
//		The first method for multiplication
//		The second method for addition 
//		The third method for subtraction
//
//		Step3: execute all methods
//
//		1. for the addition method add two numbers to make 30 
//		2. for multiplication multiply two numbers to make 30 
//		3. for Subtraction subtract two numbers to equal 20
//
//		Expected Output:
//		Addition 30
//		Multiplication 30
//		Subtraction 20

	void mul(int a , int b) {
		System.out.println(a*b);
		
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void sub(int a ,int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		
		HomeWork110 obj=new HomeWork110();
		obj.mul(3, 10);
		obj.add(20, 10);
		obj.sub(30, 10);
		
		
	}

}
