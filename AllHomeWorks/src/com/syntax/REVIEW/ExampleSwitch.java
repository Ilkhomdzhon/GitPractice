package com.syntax.REVIEW;

public class ExampleSwitch {

	public static void main(String[] args) {

		int day = 4;

		String Today;

		switch (day) {

		case 1:
			Today = "Monday";
			break;
		case 2:
			Today = "Tuesday";
			break;
		case 3:
			Today = "Thursday";
			break;

		case 4:
			Today = "Wednesday";
			break;

		case 5:
			Today = "Friday";
			break;
		case 6:
			Today = "Saturday";
			break;

		case 7:
			Today = "Sunday";
			break;

		default:
			Today = "Not valid day";

		}
		System.out.println(Today);

	}

}
