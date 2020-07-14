package com.syntax.java;

import java.util.Scanner;

public class HW38 {

	public static void main(String[] args) {
//		For you to do:
//			Prompt user with a question: "Is it weekend?"
//			If it is not a weekend --> subject="Manual testing"
//			Otherwise --> subject="Java"
//
//			Output: 
//			"Today you will be learning ____"
		     
             String subject;
             boolean weekend;
             
		    Scanner scan=new Scanner (System.in);
		    System.out.println("Is it weekend ?");
		    weekend=scan.nextBoolean();
		  
		    if (!weekend) {
		    	subject="Manual testing";
		    	
		    }else {
		    	subject="Java";
		    }
            System.out.println("Today you will be learning "+subject);
	}

}
