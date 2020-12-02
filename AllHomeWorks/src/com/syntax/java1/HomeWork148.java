package com.syntax.java1;

public class HomeWork148 {
	/* In Parent Class.
In Main Class. 
Create an object of Child without passing any argument. 
And then another object of Child class by passing the value "10". run the application. 
Expected Output: 
Parent Constructor without argument
Child Constructor without argument
10 */
	
	public HomeWork148() {
		System.out.println("Parent Constructor without argument");
		
	}
	int number ;
	public HomeWork148(int number) {
		System.out.println(number);
		
	}
	
}
class Chil extends HomeWork148{
	
	public Chil() {
		super();
		System.out.println("Child Constructor without argument");
	}
	
	int num;
	public Chil(int number) {
		super();
		
		
		
	}

}
