package com.syntax.java1;

public class HomeWork124 {
	
	/*
	 * For you to do:

Declare two static variables to hold
country name
continent

Create a method to display the value of static variables in the following format:
 
____ located on ____ continent

In the main method assign values to a static variable and execute method display

Expected Output:
Morocco located on Africa continent

	 */
	 
		 
	static String countryName ;
	static String continent;
	
		 public static void display() {
			 
			 System.out.println(countryName+" located on "+continent+" continent");
			 
		 }
		 
		 public static void main(String[] args) {
			 
			 HomeWork124.countryName="Morocco";
			 HomeWork124.continent="Africa";
			 
			
			 HomeWork124.display();
		}
}
