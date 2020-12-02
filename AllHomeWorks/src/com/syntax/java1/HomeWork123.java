package com.syntax.java1;

public class HomeWork123 {
	
	 	/*
	 	 * For you to do:

Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;

Expected Output:
3
	 	 */
	 
	
		 static int count ;
		 
		 public static void main(String[] args) {
			
			 HomeWork123 obj = new HomeWork123();
			 count++;
			 
			 HomeWork123 obj1= new HomeWork123();
			 count++;
			 
			 HomeWork123 obj2= new HomeWork123();
			 count++;
			 
			 System.out.println(count);
			 	 
		}
		 
}
