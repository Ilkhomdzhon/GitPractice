package com.syntax.java;

public class HomeWork109 {
	

//Step1: Create a method that will accept with 2 parameters of integer type
//Step2: Write the logic in that method in println statement to print hours and minutes 
//Step3: Call the method
//
//Expected Output:
//11:30
//	
	
	void time (int a , int b) {
		System.out.println(a+":"+b);
	}
	
	public static void main(String[] args) {
		HomeWork109 obj=new HomeWork109();
		obj.time(11, 30);
	}
	
}
