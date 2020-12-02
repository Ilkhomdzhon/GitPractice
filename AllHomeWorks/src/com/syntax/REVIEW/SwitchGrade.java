package com.syntax.REVIEW;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char grade;
		String explanation;

		System.out.println("Enter your Grade ");
		grade = scan.next().charAt(0);

		switch (grade) {

		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Fair";
			break;
		case 'D':
			explanation = "Bad";
			break;

			 default :
				 explanation = "Unknown ";
				 
		}
		System.out.println("Your grade is "+explanation);

	}

}
