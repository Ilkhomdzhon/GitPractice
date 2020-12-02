package com.syntax.REVIEWMETHOD;

import java.util.Scanner;

public class CountryHello {

	Scanner scan = new Scanner(System.in);

	String country, language;

	void say() {

		country = scan.next();

		if (country.equalsIgnoreCase("Tajikistan")) {

			language = "Salom";

		} else if (country.equalsIgnoreCase("USA")) {

			language = "Hello";

		} else if (country.equalsIgnoreCase("Russia")) {

			language = "Privet";

		} else if (country.equalsIgnoreCase("Turkey")) {

			language = "Merhaba";

		} else {
			language = "Invalid";
		}
		System.out.println(language);

	}

	public static void main(String[] args) {

		CountryHello lan = new CountryHello();

		lan.say();

	}

}
