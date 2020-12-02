package com.syntax.java1;

public class HomeWork158 {

	/*
	 * Instructions from your teacher: Create a method hello() in parent class that
	 * will print "method in Parent class" then override that method is 3 Subclasses
	 * implementing login to print "method in Child1/Child2/Child3 class"
	 * 
	 * In Main Class create 3 object of the child classes and store in into an array
	 * and call method hello():
	 * 
	 * Expected Output: method in Child1 class method in Child2 class method in
	 * Child3 class
	 */

	public void hello() {
		System.out.println("method in Parent class");
	}

}

class printer1 extends HomeWork158 {
	@Override
	public void hello() {
		System.out.println("method in Child1 class");
	}
}

class printer2 extends HomeWork158 {
	@Override
	public void hello() {
		System.out.println("method in Child2 class");
	}
}

class printer3 extends HomeWork158{
	
	@Override
	public void hello() {
		System.out.println("method in Child3 class");
	}
	
	
	
	
	
	
}