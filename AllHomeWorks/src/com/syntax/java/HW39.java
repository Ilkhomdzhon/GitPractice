package com.syntax.java;

import java.util.Scanner;

public class HW39 {

	public static void main(String[] args) {
//		A school has following rules for grading system:
//			a. 1 to 25 - F
//			b. 25 to 45 - E
//			c. 45 to 50 - D
//			d. 50 to 60 - C
//			e. 60 to 80 - B
//			f. Above 80 - A
//			Ask the user to enter marks and print the corresponding grade. 
//
//			Example Output:
//			Please enter your mark
//			Your grade is A
//
//			Example Output:
//			Please enter your mark
//			Please enter valid mark
		    
		    int mark;
		    String grade ;
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter your mark");
		     mark=scan.nextInt();
		     grade=scan.nextLine();
		     if (mark>1 && mark<=25) {
		    	 grade="F";
		     }else if (mark>26 && mark<=45) {
		    	 grade="E";
		     }else if (mark>46 && mark<=50) {
		    	 grade="D";
		    	 
		     } else if (mark>51 && mark<=60) {
		    	 grade="C";
		    	 
		     }else if (mark>61 && mark<=80) {
		    	 grade="B";
		     }else if (mark>81 && mark<=100) {
		    	 grade="A";
		  	 
		     }else if (mark <=0 && mark>100) {
		    	 grade="Please enter valid mark";
		    
		     }else {
		    	 
		    	 System.out.println("Your grade is "+ grade);
		    	 
		     }
		    	 
		     
		    

		       
	}
				
}
