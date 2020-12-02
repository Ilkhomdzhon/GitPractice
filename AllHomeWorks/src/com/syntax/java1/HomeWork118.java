package com.syntax.java1;

public class HomeWork118 {

	/*
	 * For you to do:
	 * 
	 * Declare 3 instance variables to hold: name of the country capital population
	 * size
	 * 
	 * Create a method to display values of instance variables
	 * 
	 * Create 2 Object, assign values to instance variables, execute method display;
	 * 
	 * Expected Output: The capital of USA is Washington DC and population is
	 * 330000000 The capital of Kazakhstan is Astana and population is 18500000
	 */

	String nameOfCountry;
	String capital;
	int population;

	void display() {
	System.out.println("The capital of " + nameOfCountry + " is " + capital + " and population is " + population);
	}
		 public static void main(String[] args) {
			
			 HomeWork118 obj = new HomeWork118();
			 obj.nameOfCountry="USA";
			 obj.capital="Washington DC";
			 obj.population=330000000;
			 
			 obj.display();
			 
			 HomeWork118 bjo= new HomeWork118();
			 bjo.nameOfCountry="Kazakhstan";
			 bjo.capital="Astana";
			 bjo.population=18500000;
			 bjo.display();
			 
			 
		}

}
