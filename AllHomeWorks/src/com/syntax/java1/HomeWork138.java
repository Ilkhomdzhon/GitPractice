package com.syntax.java1;

public class HomeWork138 {

	
	String label, category;
	double price;
	boolean hasExpiration;
	int stock;

	public HomeWork138(String label, double price, String category,  boolean hasExpiration, int stock) {
		this.label = label;
		this.category = category;
		this.price = price;
		this.hasExpiration = hasExpiration;
		this.stock = stock;

	}

	public HomeWork138(String label, double price, int stock) {

		this.label = label;
		this.price = price;
		this.stock = stock;
		this.category = "misc";
		this.hasExpiration = false;

	}

	public HomeWork138(String label, double price) {

		this.stock = 0;
		this.label = label;
		this.price = price;

	}

	public void displayInfo() {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}

	
	/*
	 * /*
	 *	 Eggs 3.0 Produce true 10
		Paper Towels 2.0 misc false 24
		Paper Towels 2.0 null false 0
	 */
	 
	public static void main(String[] args) {
		
		HomeWork138 aaa = new HomeWork138("Egg",3.0,"Produce",true,10);
			 aaa.displayInfo();
		
		HomeWork138 bbb = new HomeWork138("Paper Towel",2.0,"misc",false,24);
		bbb.displayInfo();
		
		HomeWork138 ccc = new HomeWork138("Paper Towel",2.0,"null",false ,0);
		ccc.displayInfo();
			 

	}

}
