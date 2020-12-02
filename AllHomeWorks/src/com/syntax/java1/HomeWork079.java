package com.syntax.java1;

public class HomeWork079 {
	
	public static void main(String[] args) {
		
		/*
		 * For you to do:
		Write a program to print values from a 2D array

			Example Output:
				1.4 2.0 3.3 2.0 
				4.0 1.5 6.1 1.0 
				1.2 3.1 4.0 1.6 
		 					*/
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		
		
		for (int i=0; i<a.length; i++) {
			
			for (int y=0; y<a[0].length;y++) {
				
				System.out.print(a[i][y]+" ");
				
			}
			System.out.println();
		}
		
	}

}
