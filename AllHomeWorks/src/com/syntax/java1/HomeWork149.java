package com.syntax.java1;

public class HomeWork149 {
	 /*
From your Main class create an object of the C class.

Expected Output:
I
am
a tester
	  */
	
	public HomeWork149() {
		System.out.println("I");
	}
}
class B extends HomeWork149{
	
	public B() {
		super();
		System.out.println("am");
		
	}
}
class C extends B{
	
	
	public C () {
		super();
		System.out.println("a tester");
		
	}
}