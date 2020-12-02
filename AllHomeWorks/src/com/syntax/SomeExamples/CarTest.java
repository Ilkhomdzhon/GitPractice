package com.syntax.SomeExamples;

public class CarTest {

	public static void main(String[] args) {

		Car bmw = new BMW("BMW");

		Car rav = new Toyota("Rav4");

		Car tesla = new Tesla("S Model");
		
		
		Car [] cars = {bmw,rav,tesla};
		
		for (int i=0;i<cars.length;i++) {
			
				cars[i].drive();
				cars[i].starts();
		}

	}

}
