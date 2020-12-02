package com.syntax.REVIEW;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season.Example: if user is born in June, July or August →season
		 * =”Summer”.At the end of the program we should see output as “You were born
		 * ______”.
		 */

		Scanner scan = new Scanner(System.in);
		String month;
		String season = null;

		System.out.println("Enter your birth month");

		month = scan.next();

		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season = "Summer";

		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("December")) {
			season = "Winter";

		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";

		} else {
			season = "Invalid";

		}

		System.out.println(season);

	}

}
