package com.syntax.REVIEW;

import java.util.Scanner;

public class SwitchCountry {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String country;
		String food;

		System.out.println("Where are you from ?");
		country = scan.next();

		switch (country) {

		case "Tajikistan":
			food = "Osh";
			break;
		case "Kazakistan":
			food = "Beshparmak";
			break;
		case "Belarus":
			food = "Kartoshka";
			break;
		case "USA":
			food = "Sea Food";
			break;
		case "Turkey":
			food = "Kebap";
			break;
		default:
			food = "Enter valid country";

		}
		
		System.out.println("Your favorite food is "+food);

	}
	

}
