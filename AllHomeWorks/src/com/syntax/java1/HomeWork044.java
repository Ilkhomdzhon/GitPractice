package com.syntax.java1;

import java.util.Scanner;

public class HomeWork044 {

	public static void main(String[] args) {

		/*
		 * For you to do: Prompt user with questions:
		 * "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: "Your favorite car is ___"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String car = scan.next();

		String carOrigin;

		switch (car) {

		case "BMW":
			carOrigin = "German";
			break;
		case "Toyota":
			carOrigin = "Japanese";
			break;
		case "Maseratti":
			carOrigin = "Italian";
			break;
		case "Jiguli":
			carOrigin = "Russian";
			break;
			
			default :
				carOrigin = "Unknown";
				

		}
		 System.out.println(carOrigin);

	}

}
