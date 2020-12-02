package com.syntax.java1;

import java.util.Scanner;

public class HomeWork038 {

	public static void main(String[] args) {

		/*
		 * Instructions from your teacher: For you to do: Prompt user with a question:
		 * "Is it weekend?" If it is not a weekend --> subject="Manual testing"
		 * Otherwise --> subject="Java"
		 * 
		 * Output: "Today you will be learning ____"
		 * 
		 */
		
		
		Scanner scan = new Scanner (System.in);
		 String subject = null ;
		 System.out.println("Is it Weekend");
		 boolean weekday = scan.nextBoolean();
		 
		 if (weekday) {
			 subject = "Manual testing";
			 
		 }else if (!weekday) {
			 subject = "Java";
		 }
		 
		System.out.println("Today you will be learning "+subject);
		
		 
		
		

	}

}
