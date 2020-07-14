package com.syntax.java;

public class HomeWork120 {
	
//	Declare static variable in class level as below and assign its value:
//
//		String ss="Welcome To Syntax Technologies"
//
//		Access variable in the main method and print it using three ways you learned so far
//
//		Hint:
//		first way: By calling directly
//		Second way: By using the className
//		Third way: By creating the object of the class
//
//		Expected Output:
//		Welcome To Syntax Technologies
//		Welcome To Syntax Technologies
//		Welcome To Syntax Technologies
//	
       
	   String ss="Welcome To Syntax Technologies ";
	   
	   void mm() {
		   System.out.println(ss);
		 
	   }
	     
	public static void main(String[] args) {
		
		
		HomeWork120 on =new HomeWork120();
		
		 on.mm();
		 System.out.println(on.ss);
		 
		 
		 
		
		
	}
	
}
