package com.syntax.java1;

public class HomeWork135 {

	/*
	 * For you to do: Create the maxValue method that will accept int array and
	 * return return the maximum value in the array.
	 * 
	 * Method should visible every class in any package!
	 * 
	 * Expected Output: 22
	 */

	public static int maxValue(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];

			}
		}

		return max;

	}
	
	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
	}

}
