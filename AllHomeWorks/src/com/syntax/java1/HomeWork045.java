package com.syntax.java1;

import java.util.Scanner;

public class HomeWork045 {

	public static void main(String[] args) {

		/*
		 * For you to do: Ask the user to enter any number from 1-7. Based on the number
		 * define the day of the week
		 * 
		 * 
		 * Example Output: Input a number between 1-7 Friday
		 * 
		 * Example Output: Input a number between 1-7 Invalid
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number from 1-7");
		int num = scan.nextInt();

		String day;

		switch (num) {

		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;

		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
			
			default :
				day = "No such day ";
				

		}
		System.out.println(day);

	}

}
