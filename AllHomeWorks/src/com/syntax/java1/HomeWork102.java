package com.syntax.java1;

public class HomeWork102 {

	/*
	 * For you to do:
	 * 
	 * Create a class named 'Main' with specific attributes. Create two objects of
	 * that class in which you will be assigning the following values and then print
	 * them. carColor='Black' carYear=2019 carMake='BMW'
	 * 
	 * carColor='White' carYear=2018 carMake='Toyota'
	 * 
	 * Expected Output: Car color is Black and car year is 2019 and car model is BMW
	 * Car color is White and car year is 2018 and car model is Toyota
	 */

	
	public void Car(String carColor , String carMake, int carYear) {
		
			 System.out.println("Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
	}
	
	public static void main(String[] args) {
		
		HomeWork102 car = new HomeWork102();
		
		car.Car("White", "BMW", 2019);
		car.Car("Black", "Toyota", 2020);
		
		
	}
	
}
