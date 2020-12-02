package com.syntax.REVIEW;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: ●if the
		 * average score >=90 → grade=A ●if the average score >= 70 and <90 → grade=B
		 * ●if the average score>=50 and <70 → grade=C ●if the average score<50 →
		 * grade=F
		 */

		Scanner scan = new Scanner(System.in);

		String grade = null;
		System.out.println("Enter quiz score");
		int quiz = scan.nextInt();

		System.out.println("Enter midTerm score");
		int midTerm = scan.nextInt();

		System.out.println("Enter Final score");
		int finalScore = scan.nextInt();

		int average = (quiz + midTerm + finalScore) / 3;

		if (average >= 90) {
			grade = "A";

		} else if (average > 70 && average < 90) {
			grade = "B";
		} else if (average > 50 && average < 70) {
			grade = "C";

		} else if (average < 50) {
			grade = "F";

		}
		System.out.println("Your grade is "+grade);

	}

}
