package com.syntax.java;

public class HomeWork160 {
	
//	Create a class Animal in which define instance variable type, 
//	constructor that will initialize instance variables and 2 methods eat and sleep.
//    Create a subclass Cat in which override method sleep
//
//	Create 3 Kitten subclasses of a Cat class and override method eat 
//	for 1 kitten - eats milk
//	for 2 kitten - eats snack
//	for 3 kitten - eats everything
//     In main method create object of Cat class and all 3 kittens classes and store into an array of 
//   Animals. Call available methods:
//	Expected Output:
//	Cat eats
//	Cat sleeps a lot
//	kitten1 eats milk
//	kitten1 sleeps a lot
//	kitten2 eats snacks
//	kitten2 sleeps a lot
//	kitten3 eats everything
//	kitten3 sleeps a lot

	String animal ;
	
	 void eat(String animal) {
		 this.animal=animal;
		
		 System.out.println(animal+" eats ");
	 }
	
	  void eat() {
		// TODO Auto-generated method stub
		
	}

	void sleep() {
		  System.out.println(animal+" sleeps a lot");
	  }

 class Cat extends HomeWork160{
	 
	 
	 void eat() {
		 System.out.println("Cat eats");
	 }
	 
	  @Override
	  void sleep() {
		  System.out.println("Cat sleep a lot");
	  }
 }
 class Kitten1 extends HomeWork160{
	 @Override
	 void eat() {
		 System.out.println(animal+"eats milk");
		 
		
	 }
	 
	 void sleep() {
		 System.out.println(animal+"sleep a lot");
		 super.sleep();
		 
	 }
 }
 class Kitten2 extends HomeWork160{
	 @Override
	 void eat() {
		 System.out.println(animal+"eats snacks");
		
		
	 }
	 void sleep() {
		 System.out.println(animal+" sleeps a lot");
		 super.sleep();
		
	 }
 }
 
   class Kitten3 extends HomeWork160{
	  @Override
	  void eat() {
		  System.out.println(animal+" eats everything");
		 
	  }
	  void sleep() {
		  System.out.println(animal+" sleeps a lot");
		super.sleep();
	  }
	 
		
	}
   public static void main(String[] args) {
	
	   HomeWork160 cat=new HomeWork160();
	   
	    cat.eat("Cat");
        cat.sleep();
        
        HomeWork160 k1=new HomeWork160();
        cat.eat("kitten1");
        cat.eat();
        
        HomeWork160 k2=new HomeWork160();
        k2.eat("kitten2");
        k2.eat();
}

	
}
 


