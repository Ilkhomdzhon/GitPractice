package com.syntax.REVIEW;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		String sale;
		double price;
		double discount = 0;
		double finalPrice = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Is there a sale  ?");
		sale = scan.next();

		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price ?");
			price = scan.nextDouble();

			if (price >= 20) {
				discount = price * 0.10;

			} else if (price >= 20 && price <= 100) {
				discount = price * 0.20;

			} else if (price >= 100 && price <= 500) {
				discount = price * 0.30;

			} else if (price > 500) {
				discount = price * 0.50;

			}
			finalPrice = price - discount;

			System.out.println(
					"After " + discount + " discount the price of the item reduced from " + price + " to" + finalPrice);

		} else {
			System.out.println("Not going shopping today ");
		}

	}
}
