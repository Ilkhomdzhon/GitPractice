package com.syntax.java;

public abstract class HomeWork165 {
	
//	Abstraction
//	Create a Parent Class that will have two overloaded abstract methods m1
//
//	Make Main class as concrete subclass to Parent Class 
//
//	In main method call the methods. 
//
//	Expected Output:
//	m1 without parameters
//	m1 method with parameter
     
        abstract void m1();
        
        abstract void m1(String s);
        
}

class Main extends HomeWork165{

	@Override
	void m1() {
	System.out.println("m1 without parameters");
	}

	@Override
	void m1(String s) {
		System.out.println("m1 method with parameter");
		
	}
	
	public static void main(String[] args) {
		
		HomeWork165 obj= new Main();
		
		obj.m1();
		obj.m1("abc");
		
		
	}
}

 
	

