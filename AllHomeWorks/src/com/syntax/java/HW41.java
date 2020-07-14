package com.syntax.java;

import java.util.Scanner;

public class HW41 {

	public static void main(String[] args) {
//		Write a program using the switch statement  
//		Let us consider the scenario regarding the born baby age 
//
//		First Output: "enter the age of the Child"
//
//		case 1: if age is 1 print as "You can Crawl"
//
//		case 2 : if age is 2 print as  "You can Talk"
//
//		case 3: If age is 3 print as "You can Dance"
//
//		case 4: if age is 4 print as "You can get  Trouble"
//
//		Other than this age (1-4) it should print "I don't know how old you are" 
		
		int age ;
		String behavior;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the childs age ");
		age=scan.nextInt();
		
		switch(age) {
		case 1 :
			behavior="You can Crawl";
			break;
		case 2:
			behavior="You can Talk";
			break;
		case 3:
			behavior="You can Dance";
			break;
		case 4:
			behavior="You can get  Trouble";
			break;
		 default:
			 behavior="I don't know how old you are?" ;
			 
			
		}
		System.out.println("Good--->" +behavior);
       
       
		
		
	}

}
