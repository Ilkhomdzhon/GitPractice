package com.syntax.Inheritance;

public class Car {

	String make, model;
	int year, wheel;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year=year;
		

	}

}

class Mercedes extends Car {

	String sportCar;

	public Mercedes(String make, String model, String sportCar,int year) {

		super(make, model, year);

		this.sportCar = sportCar;

	}

	public void driveCar() {

		System.out.println("My car is " + make + " " + model + " " + sportCar+" "+year);
	}
}
