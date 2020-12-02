package com.syntax.java1;

public class HomeWork134 {

	/*
	 * For you to do:
	 * 
	 * Create the maxLength method that will accept String array of words and return
	 * the word with the largest length.
	 * 
	 * Method should visible only within same package!
	 * 
	 * Expected Output: this is long
	 */

	public static String maxLength(String[] array) {

		String str = " ";

		for (int i = 1; i < array.length; i++) {
			int b = array[0].length();
			int a = array[i].length();
			if (a > b) {
				str = array[i];
				b = a;

			}
		}

		return str;
	}

	public static void main(String[] args) {
		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(maxLength(arr));
		// should print "this is long"
	}

}
