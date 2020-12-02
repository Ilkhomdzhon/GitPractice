package com.syntax.Interface;

public interface myInterface {
	
	
	/*
	 * Create an Interface with name as MyInterface
Create two undefined methods method1 and method2

Inherit the MyInterface to Main Class. 

Execute both methods

Expected Output:
implementation of method1
implementation of method2
	 */
	
	String color ="Blue";
	
	
	public void method1();
	public void method2();
	

}
class Example implements myInterface{
	
	public void method1(){
		System.out.println("The bottle I have is "+color);
		
	}
	
	public void method2() {
		System.out.println("The car I have is "+color);
	}
	
	
}