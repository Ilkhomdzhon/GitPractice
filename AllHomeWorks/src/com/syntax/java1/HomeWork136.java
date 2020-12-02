package com.syntax.java1;

public class HomeWork136 {
	
	
	String name , lastName ;
	 
	  int age , batchNumber ;
	  
	  
	  
	  public void displayInfo() {
		  System.out.println("My name is "+name+" last name is "+lastName+" I'm "+age+" year old "+" my batch is "+batchNumber);
	  }
	  
	  
	  HomeWork136(String name ,String lastName, int age ,int batchNumber){
		  this.name=name ;
		  this.lastName=lastName;
		  this.age=age;
		  this.batchNumber=batchNumber;
		  
		  
	  }
	  public static void main(String[] args) {
		
		  HomeWork136 obj =	new HomeWork136("Ilhom","Ishonkulov",34,372);
		  obj.displayInfo();
		
	}
	
}
