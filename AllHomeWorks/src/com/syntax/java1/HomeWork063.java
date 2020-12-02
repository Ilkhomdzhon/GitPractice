package com.syntax.java1;

import java.util.Scanner;

public class HomeWork063 {

	public static void main(String[] args) {

		/*
		 * Given the following inputs: int x;
		 * 
		 * Write a for loop that will print out a series of numbers starting at 0 and
		 * ending at the x(value must be taken from a user), exclusive.
		 * 
		 * Example Output: In: 3 0 1 2
		 * 
		 * In: 8 0 1 2 3 4 5 6 7
		 * 
		 * In: 5 0 1 2 3 4
		 * 
		 */

		
		Scanner scan = new Scanner (System.in);
		
		int  x ;
		
		System.out.println("Input :");
		
		x= scan.nextInt();
		
		
		for (int i=0; i<x;i++) {
			
			System.out.println(i+" ");
		}
		
		
		
	}

}
