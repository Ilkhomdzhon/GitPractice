package com.syntax.java1;

public class HomeWork081 {

	public static void main(String[] args) {

		/*
		 * For you to do: Write a program that prints the highest value in the array.
		 * 
		 * Expected Output: 8
		 */

		
		int[][] a = {
				{5,2,3,7},
				{1,22,1,1},
				{8,3,1,2}
			};
		
		 int largest = 0;
		 
		 for (int i=0;i<a.length;i++) {
			 
			 for (int y=0; y<a[i].length;y++) {
				 
				 
				 if (a[i][y]>largest) {
					 largest =a[i][y];
					 
				 }
			 }
		 }
		 
		 	 System.out.println(largest);
		
	}

}
