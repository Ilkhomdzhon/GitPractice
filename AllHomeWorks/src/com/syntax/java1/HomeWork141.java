package com.syntax.java1;

public class HomeWork141 {

	/*
	 * Create a method with name carStockValue. Write logic to calculate the total
	 * values of cars in stock and print the result.
	 * 
	 * run the application in Main Class
	 * 
	 * Expected Output: Toyota 2019 Stock Value 2500000.0 BMW 2019 Stock Value
	 * 652980.0
	 * 
	 * Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic
	 * Operations.
	 */

	String model;
	double price;
	int quantity;

	public HomeWork141(String model,  int quantity, double price) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;

	}

	public void carStockValue() {
		double totalValue = 0;
		totalValue = quantity * price;

		System.out.println(model + " " + totalValue);

	}
	public static void main(String[] args) {
		
		HomeWork141 obj = new HomeWork141("Toyota Rav4",3,28500);
			 
			obj.carStockValue();
			
			HomeWork141 b = new HomeWork141("Mercedes Benz", 5 , 55000);
			b.carStockValue();
		
	}

}
