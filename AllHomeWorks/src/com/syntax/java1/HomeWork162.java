package com.syntax.java1;

public class HomeWork162 {

	/*
	 * /* For you to do:
	 * 
	 * Create an instance final method that will reverse a String and return that
	 * new String
	 * 
	 * Call method from the main method
	 * 
	 * Expected Output: olleh
	 */

	public final String reverse(String a) {

		String newString = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			newString = newString + a.charAt(i);

		}

		return newString;

	}
	
	 	public static void main(String[] args) {
			
	 		HomeWork162 obj = new HomeWork162();
	 		
	 			String aaa= obj.reverse("Proverka");
	 			 
	 		System.out.println(aaa);
		}

}
