package com.syntax.java1;

public class HomeWork113 {

	/*
	 * Create a method with the following specs:
	 * 
	 * Returns: an integer Name: sumEvenToX Parameters: an integer called "x"
	 * Purpose: calculate the sum of the EVEN integers from 1 to x (including x)
	 * 
	 * Examples: sumEvenToX(5) ==> 6 sumEvenToX(8) ==> 20
	 */

			
		public int sumEvenToX(int x ) {
			 
			 int sum = 0 ;
			 
			 for (int i=0; i<x;i++) {
				 
				 if (x%2==0) {
					 
					 sum=sum+i;
					 
				 }
			 }
			
			 return sum;
			 
		}
			 
		 public static void main(String[] args) {
			
			 HomeWork113 met = new HomeWork113();
			 
			  int b=met.sumEvenToX(6);
			  System.out.println(b);
			  
		}
}
