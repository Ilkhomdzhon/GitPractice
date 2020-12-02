package com.syntax.REVIEW;

public class LoopIF {

	public static void main(String[] args) {

		String[] city = { "Tajikistan", "USA", "Russia", "Ukrain", "India" };

		for (String string : city) {

			if (string.equals("Tajikistan")) {
				System.out.println("The capital of "+string+ " is Dushanbe");
			} else if (string.equals("USA")) {
				System.out.println("The capital of "+string+ " is Washington DC");
			} else if (string.equals("Russia")) {
				System.out.println("The capital of "+string+ " is Moscow");
			} else if (string.equals("Ukrain")) {
				System.out.println("The capital of "+string+ " is Kiev");

			} else if (string.equals("India")) {
				System.out.println("The capital of "+string+ " is Delhi");
			}
			

		}
		
		for (int i =0 ; i<city.length;i++) {
			
			switch (city[i]) {
			
			case "Tajikistan":
				System.out.println("dushanbe");
			
			
			
			
			}
		
		
		
		}
					

	}

}
