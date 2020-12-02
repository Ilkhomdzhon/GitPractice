package com.syntax.java1;

public class HomeWork151 {
	
	/*
Create another method m2 in child class and inside that method call method m1 from child class and method m1 from parents class

in Main class. 
Create and object of child class and call m2 method

Expected Output:
m1 method in child class
m1 method in parent class
	 */
	
	public void m1() {
		System.out.println("m1 method in parent class");
		
	}
}
class Home extends HomeWork151{

	public void m1() {
		System.out.println("m1 method in child class");
		
	}
	public void m2 () {
		this.m1();
		super.m1();
		
	}
	
}
