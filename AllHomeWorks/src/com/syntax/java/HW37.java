package com.syntax.java;

import java.util.Scanner;

public class HW37 {

	public static void main(String[] args) {
//		For you to do:
//			Take 2 boolean inputs from a user:
//			 
//			"Are you thirsty?"
//			"Are you sleepy?"
//
//			If user is thirsty and not sleepy--> drink=Water
//			If user is thirsty and sleepy--> drink=Coffee
//			If user is not thirsty and sleepy --> drink=Tea
//			Otherwise drink="Nothing"
//
//			Output:
//			"Looks like you need to drink ___ "
		 
		     Scanner scan=new Scanner (System.in);
		     boolean thirsty;
		     boolean sleepy;
		     String drink;
		     System.out.println("Are you thirsty?");
		     thirsty=scan.nextBoolean();
		     
		     System.out.println("Are you sleepy?");
		     sleepy=scan.nextBoolean();
		     
		     if (thirsty && !sleepy) {
		    	drink="Drink water ";
		    	 
		     }else if (thirsty && sleepy) {
		    	drink="Coffee";
		    	
		     }else if (!thirsty && !sleepy) {
		    	 drink="Tea";
		    	 
		     }else {
		    	 drink="Nothing";
		    	 
		     }
		     System.out.println("Looks like you need to "+drink);
		
	}

}
