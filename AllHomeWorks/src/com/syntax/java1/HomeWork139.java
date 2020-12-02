package com.syntax.java1;

public class HomeWork139 {

	/*
	 * 1. Complete the Dog.java class:
	 * 
	 * Create following class variables. dogName dogWeight static dogBreed=Mutt; For
	 * all methods and variables use proper naming convention.
	 * 
	 * Create constructor to initialize instance variables
	 * 
	 * 2. In Main class Create 2 Objets of a Dog class and using each object
	 * reference variable print details of objects.
	 * 
	 * Expected Output: 
	 * Tarzan Mutt 50.0 
	 * Lucy Mutt 10.0
	 */

	String dogName;
	double dogWeight;
	static String dogBreed = "Mutt";

	public HomeWork139(String dogName,  String dogBreed, double dogWeight) {

		this.dogName = dogName;
		this.dogWeight = dogWeight;
		this.dogBreed = dogBreed;

	}

	public void displayInfo() {
		System.out.println(dogName + " " + dogBreed + " " + dogWeight);

	}
	
		 public static void main(String[] args) {
			
		
	HomeWork139 obj = new HomeWork139("Tarzan","Mutt",50.0);
	 
		   obj.displayInfo();
		   
		   HomeWork139 obb = new HomeWork139("Lucy","Mutt",10.0);
		   
		   obb.displayInfo();
		   

}
}
