package com.syntax.REVIEW;

import java.util.Scanner;

public class Example5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int sales ; 
		double comission = 0;
		
			
		 System.out.println("Please enter your monthly sales amount");
		 	 
		 	 sales = scan.nextInt();
		 	 
		 	 if (sales >= 1 && sales <= 100 ) {
		 		comission = sales * 0.10 ; 
		 		
		 		
		 	 }else if (sales >= 101 && sales <=200) {
		 		comission = sales * 0.20 ; 
		 		
		 	 }else if (sales >=201 && sales <=500 ) {
		 		comission = sales * 0.30;
		 		
		 	 }else if (sales > 500) {
		 		comission = sales * 0.50;
		 		
		 	 }
		 	 System.out.println("Based on your sales your comission will be "+comission);
		 
		
		
	}

}
