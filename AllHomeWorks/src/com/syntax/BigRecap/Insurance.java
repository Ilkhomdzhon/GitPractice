package com.syntax.BigRecap;

public abstract class Insurance {

	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;

	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

	String carModel;

	public Car(String carModel, String insuranceName) {
		super(insuranceName);
		this.carModel = carModel;

	}

	public void getQuote() {
		System.out.println(insuranceName + " is best way to make insurance for my " + carModel);
	}

	public void cancelInsurance() {
		System.out.println(insuranceName + " don't charge extra money for cancellation");

	}

}

class Pet extends Insurance {

	String petType;

	public Pet(String petType, String insuranceName) {
		super(insuranceName);
		this.petType = petType;

	}

	public void getQuote() {
		System.out.println("Can you please give me quote for my " + petType);
	}

	public void cancelInsurance() {
		System.out.println("Will you charge me if I cancel my policy for my " + petType);
	}

}

class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);

	}

	@Override
	public void getQuote() {
		System.out.println("I need please life insurance myself");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("WIll I be able to cancel anytime my life insurance");

	}

}