package com.syntax.java1;

public class HomeWork132 {

	/*
	 * In AnotherClass declare a private, default, protected, public methods and
	 * have them each return the name of the what access modifier they are using.
	 * All methods should be accessible by class name
	 * 
	 * Call methods of Another class inside Main class
	 * 
	 * Expected Output: default protected public
	 */

	public String name(String Public) {

		return Public;

	}

	protected String name1(String Protected) {

		return Protected;

	}

	private String name2(String Private) {

		return Private;

	}

	String name3(String Default) {

		return Default;

	}
	
	public static void main(String[] args) {
		
		HomeWork132 b= new HomeWork132();
		
		System.out.println(b.name("public "));
		System.out.println(b.name1("protected"));
		System.out.println(b.name2("private"));
		System.out.println(b.name3("default"));
		
		
	}

}
