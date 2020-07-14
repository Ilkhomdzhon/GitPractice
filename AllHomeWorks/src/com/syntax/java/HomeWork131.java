package com.syntax.java;

public class HomeWork131 {
	
//	For you to do 
//		In main class please declared the variables using different access modifiers that will
	//hold value for:
//		name
//		city
//		name of the school
//		batch number
//
//		Create a method to display details in following format:
//		My name is ___ and I live in ___. I study at ___ in batch ___
//
//		Assign values to the variables and execute method display
//
//		Expected Output:
//		My name is John and I live in Miami. I study at Syntax in batch 6

	
	 String name ,city ,nameOftheSchool;
	  int batchNumber;
	  
	  public void display(){
	   
 System.out.println("My name is "+name+" and I live in "+city+". "+" I study at"+nameOftheSchool+" in batch"+batchNumber);
	 
 }
		 
	 

	  public static void main(String[] args){
	    
		  HomeWork131 dis=new HomeWork131();
	     
	     dis.name="John";
	     dis.city="Miami";
	     dis.nameOftheSchool="Syntax";
	     dis.batchNumber=6;
	     
	     dis.display();
	     
	  }
	}

