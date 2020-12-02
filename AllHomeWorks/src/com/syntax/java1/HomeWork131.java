package com.syntax.java1;

public class HomeWork131 {
	
	/*
	 * Instructions from your teacher:
For you to do 
In main class please declared the variables using different access modifiers that will hold value for:
name
city
name of the school
batch number

Create a method to display details in following format:
My name is ___ and I live in ___. I study at ___ in batch ___

Assign values to the variables and execute method display

Expected Output:
My name is John and I live in Miami. I study at Syntax in batch 6
	 */

	public String name ;
	protected String city;
	 String schoolName;
	 private int batchNumber;
	 
	
	public void display() {
		
		System.out.println("My name is "+name+" I live in "+city+"."+" I study at "+schoolName+" in batch "+batchNumber);
		
	}
	
	public static void main(String[] args) {
		
		HomeWork131 obj = new HomeWork131();
		
			 obj.name="John";
			 obj.batchNumber=6;
			 obj.city="Fairfax";
			 obj.schoolName="Syntax";
			 obj.display();
	}
}
