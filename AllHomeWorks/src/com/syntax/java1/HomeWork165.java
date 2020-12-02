package com.syntax.java1;

public abstract class HomeWork165 {
	
	/*
	 * Abstraction
Create a Parent Class that will have two overloaded abstract methods m1

Make Main class as concrete subclass to Parent Class 

In main method call the methods. 

Expected Output:
m1 without parameters
m1 method with parameter
	 */
	
	public abstract void m1(String name );
	
	public abstract void m1(int num);
	

}
class Child22 extends HomeWork165{

	@Override
	public void m1(String name) {
		System.out.println("m1 without parameters");
		
		
	}

	@Override
	public void m1(int num) {
		System.out.println("m1 method with parameter");
		
	}
	
}
