package com.syntax.REVIEW;

import java.util.Scanner;

public class CandyExample7 {
	
	public static void main(String[] args) {
		
		 /*
		  * Ask a user to pay for a Candy 
		  * As long as the entered price is not 2 
		  * we keep asking for paying the exact amount 
		  * Once the amount is correct --> "Enjoy your Candy "
		  */
		
		Scanner scan = new Scanner (System.in);
		double price ;
		
		
			 do {
				 System.out.println("Please pay for a Candy ");
				 price = scan.nextDouble();
				 
			 }
			 while (price !=2);
			 System.out.println("Enjoy your Candy");
			 
		
	}

}
