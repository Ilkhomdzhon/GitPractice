package com.syntax.java1;

public class HomeWork164 {

	/*
	 * For you to do:
	 * 
	 * Create final method avgElements that will average all the elements in an
	 * integer array (passed to the method as a parameter) and return the average.
	 * 
	 * Expected Output: 4.8
	 */

	public final double avgElements(int[] b) {

		double average = 0;

		double sum = 0;

		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];

		}

		average = sum / b.length;

		return average;

	}

	public static void main(String[] args) {

		HomeWork164 obj = new HomeWork164();

		int[] a = { 2, 7, 3, 8, 4 };
		
		double cc=obj.avgElements(a);
		System.out.println(cc);
		

	}

}
