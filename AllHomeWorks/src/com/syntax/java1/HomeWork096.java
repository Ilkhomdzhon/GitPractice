package com.syntax.java1;

import java.util.Scanner;

public class HomeWork096 {

	public static void main(String[] args) {

		/*
		 * Given the following inputs: String s;
		 * 
		 * Write a for loop that will print out the reverse of the string.
		 * 
		 * Sample input/outputs: In: manhattan nattahnam
		 * 
		 * In: processor rossecorp
		 * 
		 * In: racecar racecar
		 */

		Scanner scan = new Scanner (System.in);
		
		String s ;
		
		 System.out.println("In : ");
		 	
		 s=scan.next();
		 	
		 	 
		 	 for (int i=s.length()-1;i>=0;i--) {
		 		 
		 		 System.out.print(s.charAt(i));
		 	 }
		
		
	}

}
