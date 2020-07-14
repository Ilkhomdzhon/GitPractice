package com.syntax.java;

public class HomeWork115 {
	

//Returns:
//a String
//Name:
//censorLetter
//Parameters:
//a String
//a char
//
//Then complete the method by programming the following behavior
//Replace all instances of given character with a "*" within the given String.
//See below examples.
//
//Examples:
//censorLetter("computer science",'e') ==> "comput*r sci*nc*"
//censorLetter("trick or treat",'t') ==> "*rick or *rea*"

	String censorLetter(String a ,char b) {
		String c=Character.toString(b);
		a=a.replaceAll("e", "*");
		return a;
		
		
	}
	public static void main(String[] args) {
		
		HomeWork115 on =new HomeWork115();
		
		System.out.println(on.censorLetter("computer science", 'e'));
		System.out.println(on.censorLetter("trick or treat", 't'));
		
	}
	
	
	
	
	
	
}
