package com.syntax.java1;

public class HomeWork107 {
	
	
	 /*
	  * For you to do:

1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
3. Call both methods

Expected Output:
Welcome to Syntax Technologies!
Welcome Syntax Students!
	  */
	
	 void syntaxTechnologies() {
		 System.out.println("Welcome to Syntax Technologies!");
	 }
	 
	 void syntaxStudents() {
		 System.out.println("Welcome Syntax Students!");
	 }
	 
	 public static void main(String[] args) {
		
		 HomeWork107 met = new HomeWork107();
		 
		 met.syntaxStudents();
		 met.syntaxTechnologies();
		 
	}
	
}
