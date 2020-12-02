package com.syntax.java1;

public class HomeWork137 {
	
	private static final String HomeWork137 = null;
	/*
	 
1. Complete the SyntaxTechnologies class:

Include the following class variables:
* schoolName(String)
* batch(int)
* year(int)
* lastDayOfClass(String)

Write two constructors:
* non-argument constructor
* parameterized constructor

Create method to display values of instance variables.

2. In Main Class:
Create two different objects of the SyntaxTechnologies class using both constructors and call display method.

Expected Output:
null 0 0 null
Syntax 6 2020 07/30/2020
	 */
	
	String schoolName, lastDayOfClass;
	int batch , year;
	
	public HomeWork137 () {
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
	public HomeWork137(String schoolName, int batch,String lastDayOfClass,int year ) {
		
			 this();
			 
	}
	
	void displayInfo() {
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
	public static void main(String[] args) {
		
		
		HomeWork137 obj= new HomeWork137();
		
		obj.schoolName="Syntax";
		obj.batch=6;
		obj.year=2020;
		obj.lastDayOfClass="07/30/2020";
		
		obj.displayInfo();
		
	}

}
