package com.syntax.java;

public class HomeWork106 {
	
//	1. Create a method name as newLine that should have print statement inside the 
//	method body as "newLine method implementation"
//	1. Create a method name as displayLine that should have print statement inside the 
//	method body as "displayLine method implementation"
//	3. Call both methods
//
//	Expected Output:
//	newLine method implementation
//	displayLine method implementation

	void newLine() {
		System.out.println("newLine method implementation");
	}
	void displayLine() {
		System.out.println("displayLine method implementation");
	}
	public static void main(String[] args) {
		
		HomeWork106 ooo=new HomeWork106();
		ooo.newLine();
		
		HomeWork106 bbb=new HomeWork106();
		bbb.displayLine();
		
	}
}
