package com.syntax.SomeExamples;

public class Car {

	String make;

	public Car(String make) {
		this.make = make;

	}

	public void drive() {
		System.out.println("I drive " + make);
	}

	public void starts() {
		System.out.println(make + "starts with pulling");
	}

}

class BMW extends Car {

	public BMW(String make) {
		super(make);

	}

	public void drive() {

		System.out.println("I drive" + make + " is good car");
	}

	public void starts() {
		System.out.println(make + " starts with key");
	}
}

class Toyota extends Car {

	public Toyota(String make) {
		super(make);

	}

	public void drive() {
		System.out.println("I drive my " + make + " in city");
	}

	public void starts() {
		System.out.println(make + " starts with start button");
	}

}

class Tesla extends Car {

	public Tesla(String make) {
		super(make);

	}

	public void drive() {
		System.out.println("While driving my" + make + " it is not consumes gas");
	}

	public void start() {
		System.out.println(make + " starts in command voice"
				+ "");
	}

}
