package com.syntax.java1;

public class HomeWork122 {
	
	/*
	 * For you to do:

Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."

The second method should be a static method that will print out the following message:
"Java is awesome."

Execute both methods

Expected Output:
Programming is amazing.
Java is awesome.
	 */
	 
		 void nonStatic() {
			 System.out.println("Programming is amazing");
		 }
		
		 public static void withStatic() {
			 System.out.println("Java is awesome");
			 
		 }
		 	public static void main(String[] args) {
				
		 		HomeWork122 obj = new HomeWork122();
		 		obj.nonStatic();
		 		
		 		HomeWork122  d = new HomeWork122();
		 			 d.withStatic();
		 		
			}
}
