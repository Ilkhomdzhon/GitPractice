package com.syntax.java1;

import java.util.Scanner;

public class HomeWork039 {

	public static void main(String[] args) {

		/*
		 * A school has following rules for grading system: a. 1 to 25 - F b. 25 to 45 -
		 * E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A Ask the
		 * user to enter marks and print the corresponding grade.
		 * 
		 * Example Output: Please enter your mark Your grade is A
		 * 
		 * Example Output: Please enter your mark Please enter valid mark
		 */

		String grade = null ;
		
		Scanner scan = new Scanner (System.in);
		
		 System.out.println("Please enter your mark ");
		
		 int point = scan.nextInt();
		 
		 if (point >=1 && point <= 25) {
			  
			  grade = "F";
			  	 
		 }else if (point >=26 && point<=45 ) {
			 grade = "E";
			 
		 }else if (point >=46 && point <=50) {
			 grade ="D";
			 
		 }else if (point >=51 && point <=60 ) {
			 grade ="C";
		
		 }else if (point >=61 && point <=80) {
			 grade = "B";
		 }else if (point > 80 ) {
			 grade = "A";
			 
		 }else {
			 grade ="Please enter valid mark ";
			 
		 }
		
		 
		 System.out.println("Your grade is "+grade);
		 
		
		
		
	}

}
