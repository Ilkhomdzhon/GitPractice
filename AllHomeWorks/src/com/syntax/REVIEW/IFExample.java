package com.syntax.REVIEW;

import java.util.Scanner;

public class IFExample {
	
	 public static void main(String[] args) {
		 
		 /*
		  * 1.Prompt the user to enter person heights in inches. 
		  * Person should be classified as one of the following:• 
		  * short (under 60 inch)• 
		  * medium(between 60 -72 inch)• 
		  * tall (over 72 inch)
		  */
		 
		 Scanner scan = new Scanner (System.in);
		 
		 String rost = null ; 
		 System.out.println("Enter your heights in inches");
		 int heights = scan.nextInt();
		 
		  if (heights<= 60) {
			  rost = "short";
			  
		  }else if (heights>60 && heights<=72) {
			  rost = "medium";
		  }else if (heights>72) {
			  rost = "tall";
			  
		  }
		  System.out.println(rost);
		  
		 
		
	}

}
