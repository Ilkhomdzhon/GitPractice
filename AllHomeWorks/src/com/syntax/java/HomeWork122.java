package com.syntax.java;

public class HomeWork122 {
	
//	For you to do:
//
//		Create a variable that will hold the count of all instances of the Main class
//
//		Create 3 Object of the class and print value of the count variable;
//
//		Expected Output:
//		3
	

static int count;

	
	public static void main(String[] args) {
		
		HomeWork122 on=new HomeWork122();
		count++;
		
		HomeWork122 off=new HomeWork122();
		count++;
		HomeWork122 ff=new HomeWork122();
		count++;
		
		
		System.out.println(count);
		
	}
}
