package com.syntax.java;

public class HomeWork136 {
	
//	1. Complete the SyntaxTechnologies class:
//
//		Include the following class variables:
//		* schoolName(String)
//		* batch(int)
//		* year(int)
//		* lastDayOfClass(String)
//
//		Write two constructors:
//		* non-argument constructor
//		* parameterized constructor
//
//		Create method to display values of instance variables.
//
//		2. In Main Class:
//  Create two different objects of the SyntaxTechnologies class using both constructors and 
	//call display method.
//
//		Expected Output:
//		null 0 0 null
//		Syntax 6 2020 07/30/2020
	
	String schoolName;
	int  batch ;
	int year;
	String lastDayOfClass;
	
	 void Constructor  () {
		
	}
	
	 void Constructor (String a ,String b) {
		 
		 System.out.println("null 0 0 null");
		
	}
	
		public static void main(String[] args) {
			
	HomeWork136 obj=new HomeWork136();
	obj.Constructor();
	obj.Constructor(null, null);
	
	
	obj.schoolName="Syntax";
	obj.batch=6;
	obj.year=2020;
	obj.lastDayOfClass="07/30/2020";
	System.out.print(obj.schoolName+" ");
	System.out.print(obj.batch+" ");
	System.out.print(obj.year+" ");
	System.out.print(obj.lastDayOfClass);
}
}
