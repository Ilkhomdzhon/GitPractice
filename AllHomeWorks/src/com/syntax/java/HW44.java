package com.syntax.java;

import java.util.Scanner;

public class HW44 {

	public static void main(String[] args) {
//		For you to do: 
//			Prompt user with questions: "Please enter your favorite car make"
//
//			if user enters  BMW -->  carOrigin = "german car"
//			if user enters  Toyota -->  carOrigin = " japanese car"
//			if user enters  Maserati -->  carOrigin = "italian car"
//			anything else besides those values --> carOrigin = "unknown" 
//			 
//			The output of your program should be:
//			"Your favorite car is ___"
		String make ;
		String carOrigin;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your favorite car make");
		make=scan.nextLine();
		
		switch(make) {
		case "BMW" :
			carOrigin = "german car";
			break;
		case  "Toyota":
			carOrigin = " japanese car";
			break;
		case "Maserati":
			carOrigin = "italian car";
			break;
		case "Jiguli":
			carOrigin="made in ussr";
			break;
			
		      default:
		    	  carOrigin = "unknown";
		    	  
			
		}
		System.out.println(carOrigin);
		
		
	}

}
