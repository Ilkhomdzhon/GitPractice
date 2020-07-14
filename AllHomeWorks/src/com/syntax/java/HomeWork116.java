package com.syntax.java;

public class HomeWork116 {
	
//	For you to do:
//
//		Declare 3 instance variables to hold: 
//
//		year, school name and batch #
//
//		Access variables from the main method and assign specific values to them
//		Print values of your variables in the following format:
//
//		Expected Output:
//		I am a student of batch 6 studying at Syntax in the year of 2020
	
	int year;
	String schoolName;
	int batchNumber;
	
	
	  void access() {
	System.out.println("I'm a student of batch "+batchNumber+" studying at "+schoolName+"int the year of "+year);
	  
  }
	  public static void main(String[] args) {
		  
		  HomeWork116 on =new HomeWork116();
		  
		  on.batchNumber=6;
		  on.schoolName="Syntax";
		  on.year=2020;
		  
		  on.access();
		
	}
	  


}
