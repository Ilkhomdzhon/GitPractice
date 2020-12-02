package com.syntax.Inheritance;

public abstract class Vehicle {

	String make;
	static int totalCars;

	public Vehicle(String make) {
		this.make = make;
		totalCars++;
		

	}

	public void drive() {
		System.out.println("drives slow");
	}

	public void brake() {
		System.out.println(" brakes slow");

	}

	public abstract void horn();

	public abstract void noise();
	
	public static void total() {
		System.out.println("we build "+totalCars);
	}

}

abstract class Car1 extends Vehicle {

	String carColor;

	public Car1(String make, String carColor) {
		super(make);
		this.carColor = carColor;

	}

	@Override
	public void drive() {
		System.out.println(make + "drives fast");
	}

	public void brake() {
		System.out.println(make + " brakes slow");
	}

	public void horn() {
		System.out.println(make + "has bad horn voice");
	}

}

class Tesla extends Car1 {

	public Tesla(String make, String carColor) {
		super(make, carColor);

	}

	public void noise() {
		System.out.println("My " + make + " is color" + carColor + " is never makes noise");
	}

	public void brake() {
		System.out.println(make + " brakes very fast its like sport car");
	}

	public void drive() {
		System.out.println(make + " drives smoothly");

	}

}

class Rav4 extends Car1 {

	public Rav4(String make, String carColor) {
		super(make, carColor);

	}

	@Override
	public void noise() {

		System.out.println(make + " it never makes noise ");

	}

	public void drive() {
		System.out.println(make + " drives like a ship");

	}

}