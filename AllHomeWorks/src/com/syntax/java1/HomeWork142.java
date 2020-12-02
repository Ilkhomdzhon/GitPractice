package com.syntax.java1;

public class HomeWork142 {
	/*
write a logic to to calculate the total values of items in stock. and print the result. 
return the total value. 
In Main Class. 
Create two Object of ShoppingStore and pass the parameters to Constructor. 
then using each object call the method itemTotalPrice. 
Store the returned value of each object. 
Calculate sum of both object and print the result. 
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types. 
	 */
	
	String item ;
	double price ;
	int quantity ;
	
	public HomeWork142(String item , int quantity ,double price ) {
		
		this.item=item ;
		this.quantity=quantity;
		this.price=price;
	}
	
	public double itemTotalPrice() {
		
		double totalValue;

		totalValue=quantity *price;
		
		System.out.println(item+" Total Value "+totalValue);
	
		return totalValue ;
	
	}
	public static void main(String[] args) {
		
		HomeWork142 a = new HomeWork142("Blanket",9 ,10.99);
		double ab=a.itemTotalPrice();
		
		HomeWork142 b = new HomeWork142("Mattress",5,5.99);
		double bc=b.itemTotalPrice();
		
		double sum =ab+bc;
		
		System.out.println("You purchased "+sum+" today");
		
		
		
	}

}
