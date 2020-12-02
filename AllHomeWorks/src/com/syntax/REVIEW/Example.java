package com.syntax.REVIEW;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 →output “It is a weekday”, anyday from 6-7 →output “It is a
		 * weekend”, any other day →output “Invalid day”
		 */

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a day week number");
		int num = scan.nextInt();
		String day;
		
		if (num ==1 || num == 2) {
			day = "weekday";
			
		}else if (num == 3 || num == 4) {
			day = "weekday";
			
		}else if (num == 5) {
			day = "weekday";
			
		}else if (num == 6 || num == 7) {
			day = "weekend";
			
		}else {
			day ="Invalid day ";
			
			
		}
		System.out.println(day);
		 
}
}
