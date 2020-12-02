package com.syntax.java1;

public class HomeWork112 {

	/*
	 * Create a method that will accept 2 numbers as parameters and return true if
	 * both numbers are even otherwise returned false ( Return false if one or both
	 * given numbers are not even)
	 * 
	 * Examples: bothEven(4,6) ==> true bothEven(3,4) ==> false bothEven(-1,1) ==>
	 * false
	 * 
	 * Expected Output: false
	 */

	public boolean evenMethod(int a, int b) {

		boolean value = false;

		if (a % 2 == 0 && b % 2 == 0) {

			value = true;

		} else if (a % 2 != 0 && b % 2 == 0) {

			value = false;

		} else if (a % 2 == 0 && b % 2 != 0) {

			value = false;

		} else {
			value = false;
		}

		return value;

	}
		 public static void main(String[] args) {
			
			 HomeWork112 met = new HomeWork112();
			 
			 boolean a=met.evenMethod(10, 6);
			 	 System.out.println(a);
			 
		}
	 	 

}
