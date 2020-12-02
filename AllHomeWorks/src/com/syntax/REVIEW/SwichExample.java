package com.syntax.REVIEW;

import java.util.Scanner;

public class SwichExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char gender ;
		String sex ;
		
		System.out.println("Please enter gender M or F");
		
			 gender = scan.next().charAt(0);
			 
			 switch (gender) {
			 
			 case  'M' :
				 sex = "Male";
				 break ;
			 case 'F' :
				 sex = "Female";
				 break ;
				 
				 default :
					 sex = "Error sex";
					 
			 }
		System.out.println("You are a "+sex);
		
		
	}

}
