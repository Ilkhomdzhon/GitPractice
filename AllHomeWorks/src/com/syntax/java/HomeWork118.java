package com.syntax.java;

public class HomeWork118 {
//	
//	For you to do:
//
//		Declare 3 instance variables to hold:
//		name of the country
//		capital
//		population size
//
//		Create a method to display values of instance variables
//
//		Create 2 Object, assign values to instance variables, execute method display;
//
//		Expected Output:
//		The capital of USA is Washington DC and population is 330000000
//	    The capital of Kazakhstan is Astana and population is 18500000
//	
	 
	 String nameofCountry;
	 String capital;
	 int populationSize;
	 
	 void mix() {
 System.out.println("The capital of is "+nameofCountry+" is"+capital+"and population is "+populationSize);
	
	 }
	 public static void main(String[] args) {
		 
		 HomeWork118 pm=new HomeWork118();
		 
		  pm.nameofCountry="USA";
		  pm.capital="Washington DC";
		  pm.populationSize=330000000;
		  
		   pm.mix();
		   
		 HomeWork118 am=new HomeWork118();
		 
		 am.nameofCountry="Kazakhstan";
		 am.capital="Astana";
		 am.populationSize=18500000;
		 
		 am.mix();
		
	}
	

}
