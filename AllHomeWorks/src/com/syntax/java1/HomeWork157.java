package com.syntax.java1;

public class HomeWork157 {

	/*
	 * In Parent Class create a method with name method() that will print
	 * "Parent method"
	 * 
	 * Override method() in Child class that will print "Child method"
	 * 
	 * In Main Class create objects of child and parent class and call its method.
	 * 
	 * Expected Output: Parent method Child method
	 */

	public void method() {
		System.out.println("Parent method ");
	}

}

class Son extends HomeWork157 {

	@Override
	public void method() {
		System.out.println("Child method");
	}
}



	



