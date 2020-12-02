package com.syntax.java1;

public class HomeWork146 {
	
	/*
In Main class. 
Create an Object of the child class by passing String value "Vienna"

Expected Output:
Vienna
	 */
	
	String city ;
	
	
	public HomeWork146(String city) {
		 this.city=city;
		 
	}
	
		 public HomeWork146() {
			 System.out.println("Parent Constructor");
			 
		 }
}
class Child extends HomeWork146{

	
	public Child(String city) {
		super(city);
		
	}
	
	public void displayInfo() {
		System.out.println(city);
	}
	
	
}
