package com.syntax.java;

public class HomeWork102 {
	

//		Create a class named 'Main' with specific attributes.
//		Create two objects of that class in which you will be assigning the following values and then print them.
//		carColor='Black'
//		carYear=2019
//		carMake='BMW'
//
//		carColor='White'
//		carYear=2018
//		carMake='Toyota'
//
//		Expected Output:
//		Car color is Black and car year is 2019 and car model is BMW
//		Car color is White and car year is 2018 and car model is Toyota

	String carMake;
	String carColor;
	int carYear;
	
	void mix () {
		System.out.println("Car color is "+carColor +" and make is "+carMake+" and year is "+carYear);
	}
	
	
     public static void main(String[] args) {
    	 
    	 HomeWork102 car=new HomeWork102();
    	  
    	 car.carColor="White";
    	 car.carMake="Toyota";
    	 car.carYear=2019;
    	 
    	 car.mix();
    	 
    	 HomeWork102 car1= new HomeWork102();
    	 car1.carColor="Black";
    	 car1.carMake="Mercedes";
    	 car1.carYear=2019;
    	 
    	 car1.mix();
		
	}
	 
}


