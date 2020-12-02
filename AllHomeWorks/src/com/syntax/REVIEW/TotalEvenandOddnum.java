package com.syntax.REVIEW;

import java.util.Scanner;

public class TotalEvenandOddnum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num1 ; 
		int num2 ;
		
		int sumOfEven=0;
		int sumOfOdd=0;
		
		System.out.println("Enter first number ");
		num1 = scan.nextInt();
		
		System.out.println("Enter second number");
		num2 = scan.nextInt();
		
		for (int i=num1 ; i<num2; i++) {
			if (i%2==0) {
				sumOfEven = sumOfEven+i;
				
			}else {
				sumOfOdd=sumOfOdd+i;
			}
		}
		
		 System.out.println("Sum of Even numbers "+num1+num2+sumOfEven);
		 System.out.println("Sum of Odd numbers"+num1+num2+sumOfOdd);
	}

}
