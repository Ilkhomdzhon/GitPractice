package com.syntax.java;

import java.util.Scanner;

public class HW96 {

	public static void main(String[] args) {
		
//		 Given the following inputs:
//			 String s;
//
//			 Write a for loop that will print out the reverse of the string.
//
//			 Sample input/outputs:
//			 In: manhattan
//			 nattahnam
//
//			 In: processor
//			 rossecorp
//			 In: racecar
//			 racecar
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enter word take reverse");
			String word=scan.nextLine();
			
			for (int i=word.length()-1;i>=0;i--) {
				System.out.print(word.charAt(i));
			}
	}

}
