package com.syntax.java;

import java.util.Scanner;

public class HW45 {

	public static void main(String[] args) {
//		For you to do:
//			Ask the user to enter any number from 1-7.
//			Based on the number define the day of the week
//
//
//			Example Output:
//			Input a number between 1-7
//			Friday
//
//			Example Output:
//			Input a number between 1-7
//			Invalid
		int day ;
		String weekDay;
		
		Scanner scan = new Scanner (System.in);
		System.out.println(" enter any number from 1-7");
		day=scan.nextInt();
		
		switch(day) {
		
		case 1:
			weekDay="Monday";
			break;
		case 2 :
			weekDay="Tuesday";
			break;
		case 3:
			weekDay="Wednesday";
			break;
		case 4:
			weekDay="Thursday";
			break;
		case 5:
			weekDay="Friday";
			break;
		case 6 :
			weekDay="Saturday";
			break;
		case 7:
			weekDay="Sunday";
			break;
			
			default:
				weekDay="Invalid";
				
		}
		System.out.println("Today is "+weekDay);
		
		
		
	}

}
