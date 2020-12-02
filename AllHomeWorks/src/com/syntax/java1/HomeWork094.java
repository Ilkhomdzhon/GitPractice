package com.syntax.java1;

import java.util.Scanner;

public class HomeWork094 {

	public static void main(String[] args) {

		/*
		 * For you to do:
		 * 
		 * If browser is ChRoME it should print the: "Proceed with Chrome browser"
		 * 
		 * If browser is FireFOX it should print the: "Proceed with Firefox browser"
		 * 
		 * If browser is IE it should print the: "Proceed with IE browser"
		 * 
		 * If any other browser it should print the: "Invalid browser"
		 * 
		 */

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter browser ?");
		String browser = scan.next();
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
			browser = "Proceed with Chrome browser";
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			
			browser = "Proceed with Firefox browser";
			
		}else if (browser.equalsIgnoreCase("IE")) {
			
			browser = "Proceed with IE browser";
			
		}else {
			
			 browser = "Invalid browser";
		}
		
		
		System.out.println(browser);
		
		
	}

}
