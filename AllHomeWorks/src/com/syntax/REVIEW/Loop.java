package com.syntax.REVIEW;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		
		/*
		 * we are playing a lottery and lucky number is 17 
		 * we want to keep asking user any number from 1 - 20 
		 * until he gets lucky number ,and output should be "Congratulation";
		 * 
		 */
		 	
		 Scanner scan = new Scanner (System.in);
		 
		 int num  ;
		 int luckyNumber = 17 ;
		 do {
			 System.out.println("Please Enter a number ");
			 num = scan.nextInt();
			 
		 }
		 
		 
		 while ( num !=luckyNumber) ;
			 
			 System.out.println("Congratulation!!!!!");
		 
		 
		 
		
	}

}
