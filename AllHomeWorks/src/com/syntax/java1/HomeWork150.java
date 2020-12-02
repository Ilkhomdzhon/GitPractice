package com.syntax.java1;

public class HomeWork150 {
	
	/*
create a method to display value of variable i from both classes

In Main Class create an object of subclass and call method display

Expected Output:
20
10
	 */

	int i =10;
	
}
class Two extends HomeWork150{
	
	int i=20;
	
	public void info() {
		System.out.println(i);
		System.out.println(super.i);
		
	}
	
}