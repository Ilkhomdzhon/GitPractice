package com.java.practise01;

public class Calculator {
	
	
	void add  (int a , int b) {
		
		System.out.println(a+b);
	}
	
	void sub(int a ,int b) {
		System.out.println(a-b);
	
	}
	
	void mult(int a , int b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		cal.add(50,44);
		cal.sub(50, 3);
		cal.mult(4, 55);
		
		
	}

}
