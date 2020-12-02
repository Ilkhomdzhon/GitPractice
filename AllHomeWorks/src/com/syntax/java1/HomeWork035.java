package com.syntax.java1;

import java.util.Scanner;

public class HomeWork035 {

	public static void main(String[] args) {

		/*
		 * For you to do: Prompt user to input two strings :
		 * "Please enter two strings"and two integers: "Please enter two numbers" and
		 * make the comparisons: if int1 and int2 are equal and word1 and word2 are
		 * equal, output "AND" if int1 and int2 are equal or word1 and word2 are equal,
		 * output "OR" if int1 and int2 are not equal and word1 and word2 are not equal,
		 * output "NONE"
		 * 
		 * Example input/output: word1: banana word2: banana int1: 2 int2: 2 Output: AND
		 * 
		 * word1: banana word2: apple int1: 2 int2: 2 Output: OR
		 * 
		 * word1: phone word2: pie int1: 2 int2: 3 Output: NONE
		 */
		
		
		Scanner scan = new Scanner (System.in);
		 
		  System.out.println("Enter two strings ");
		   
		   	String str = scan.next();
		   	String str1 = scan.next();
		   	
		   	System.out.println("Enter two integer ");
		   	
		   	 int num = scan.nextInt();
		   	 int num1 = scan.nextInt();
		   	 
		   	 if (str.equalsIgnoreCase(str1) && num == num1) {
		   		 System.out.println("AND");
		   	 }else if (str.equals(str1) || num == num1) {
		   		 System.out.println("OR ");
		   	
		   	 }else {
		   		 System.out.println("NONE ");
		   	 }
		   	 


	}

}
