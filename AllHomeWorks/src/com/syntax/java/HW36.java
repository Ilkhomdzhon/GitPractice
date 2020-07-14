package com.syntax.java;

import java.util.Scanner;

public class HW36 {

	public static void main(String[] args) {
//		For you to do:
//			Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
//			and make the comparisons:
//			if int1 and int2 are equal and word1 and word2 are equal, output "AND"
//			if int1 and int2 are equal or word1 and word2 are equal, output "OR"
//			if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
//
//			Example input/output:
//			word1: banana
//			word2: banana
//			int1: 2
//			int2: 2
//			Output: AND
//
//			word1: banana 
//			word2: apple 
//			int1: 2 
//			int2: 2 
//			Output: OR
//
//			word1: phone
//			word2: pie
//			int1: 2
//			int2: 3
//			Output: NONE
            Scanner scan=new Scanner (System.in);
            
            System.out.println("Enter two words");
            String word1=scan.next();
            String word2=scan.next();
            
            System.out.println("Enter two numbers");
            int num1=scan.nextInt();
            int num2=scan.nextInt();
            
           if (word1.contentEquals(word2)&& num1==num2) {
        	   System.out.println("AND");
         
           }else if (word1.contentEquals(word2)|| num1==num2) {
        	   System.out.println("OR");
           }else {
        	   System.out.println("NONE");
           }
     
	}

}
