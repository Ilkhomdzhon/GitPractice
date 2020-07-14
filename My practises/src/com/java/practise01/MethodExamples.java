package com.java.practise01;

public class MethodExamples {
	
	 String  carColor="Black";
	 String carMake="BMW";
	 int  carYear=2019;			 

	
	
	void Car(String name) {
		System.out.println("I want to greet "+name);
		
	}
      public static void main(String[] args) {
		
    	  MethodExamples anyname= new MethodExamples();
    	  anyname.Car("Mahmud");
    	  anyname.Car("Ilhom");
    	  anyname.Car("Bibo");
    	  anyname.Car("Ahmad");
    	  
	}
}
