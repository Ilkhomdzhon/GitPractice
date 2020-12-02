package com.syntax.Inheritance;

public class VehicleTest {

	public static void main(String[] args) {

		Vehicle tesla = new Tesla("Tesla", "Model S");
		tesla.drive();
		tesla.brake();
		tesla.horn();
		tesla.noise();
		
		
		Vehicle rav = new Rav4("Rav4","White");
		rav.brake();
		rav.noise();
		rav.noise();
		rav.drive();
		rav.noise();
		
		
		Vehicle.total();
		
		
		
		
		
		
		//new Rav4(null, null);

	}

}
