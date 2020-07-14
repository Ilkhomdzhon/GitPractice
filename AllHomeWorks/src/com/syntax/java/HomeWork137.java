package com.syntax.java;

public class HomeWork137 {
//	1. Complete the Car.java class:
//		Create the following variable (Choose proper datatype)
//		* make
//		* model
//		* numberOfDoors
//		* topSpeed
//		* price
//		following the proper naming convention for variables. 
//
//		Write four constructors:
//		* The first constructor(with all parameters)
//		* A secondary constructor Have all parameters except numberOfDoors. 
	      //(numberOfDoors value should assign to 4 inside constructor)
//		* A third constructor Have all parameters except make and model . 
	     // (make and model value should assign to "unknown" inside constructor) 
//		* A fourth constructor Have all parameters except topSpeed and price;
	      //(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)  
//
//		Create a display method in Cars class to print the class variable value in console. 
//
//		2. Test your code with the Main.java class:
//		Create several Car objects using all Constructors. 
//		then call display method with each object. 
//
//		Output: 
//		Toyota Prius 4 120 30000.0
//		Toyota Prius 4 120 30000.0
//		unknown unknown 4 120 30000.0
//		Toyota Prius 4 90 0.0
 
      String make, model;
     
      int  numberOfDoors, topSpeed ;
      double price;
 
 
    public void Car (String make ,String model) {
    	this.make=make;
	 	this.model=model;
	 
 }
    public void Car(int numberOfDoors,int topSpeed,double price ) {
    	this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
        
  	
    }
    public void displayCar() {
    	System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    	
    }
    		
      public static void main(String[] args) {
		
    	  HomeWork137 car=new HomeWork137();
  	  
           car.Car("Toyota", "Prius");
           car.Car(4, 120, 30000.0);
           
         
           HomeWork137 car1=new HomeWork137();
           
           car1.Car("Toyota", "Prius");
           car1.Car(4, 120, 30000.0);
           
           HomeWork137 car2=new HomeWork137();
           
           car2.Car("unknown", "unknown");
           car2.Car(4, 120, 30000.0);
           
           HomeWork137 car3=new HomeWork137();
            
           car3.Car("Toyota", "Prius");
           car3.Car(4, 90, 0.0);
           
           car.displayCar();
          
          car1.displayCar();
          car2.displayCar();
          car3.displayCar();
           
 
    	  
	}
}
