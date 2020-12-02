package com.syntax.java1;

public abstract class HomeWork166 {
	
	
	/*
	 * Abstraction
Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1

Make Main class to be a derived class from Parent.

In main method execute both methods

Expected Output: 
Child class providing implementation
Parent class providing implementation
	 */

	public void m1() {
		System.out.println("Parent class providing implementation");
	}
	
	public abstract void m2();
	
	
}
class Son12 extends HomeWork166{

	@Override
	public void m2() {
		System.out.println("Child class providing implementation");
		
	}
	
}