package com.java.review01;

public class VariableEx {
	
	public static void main(String[] args) {
		
		// String is non premitive
		
		// Declare the variable 
		String firstName;
		//Assign a value
		firstName="John";
		
		//Declare the variable & Assign a value
		String lastName="Smith";
		
		int age=28;
		
		
		
		System.out.println(firstName+" "+lastName+" "+"is "+age+" "+" years old");
		
		//re-assign a new value-->after getting married (changed name)
		
		lastName="Brown";
		age=32;
		
		
		System.out.println("after getting married(after reaasigning the variable system will get reassigned variable) :");
		System.out.println(firstName+" "+lastName+" now he is "+age);
	}

}
