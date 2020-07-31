package com.java.review11;

public class TestInterface2 {

	public static void main(String[] args) {
		
		// can we create an instance of Vehicle class ?
		// can we create an instance of Bicycle by giving reference to Vehicle interface ? -->Yes

		Vehicle bicycle=new Bicycle();
		
		bicycle.changeGear(6);
		bicycle.speedUp(15);
		bicycle.applyBreak(4);
		
	}

}
