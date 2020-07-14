package com.java.practise01;

public class Car {
	
	
	String model;
	String make ;
	int year ;
	int size ;
	
	
	void accelerate() {
		System.out.println(make+" can accelerate");
	}
	void stop() {
		System.out.println(make+" can stop");
	}
	void drift() {
		System.out.println(make+" can drift");
	}
	
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		
		car1.make="Toyota ";
		car1.model="Camry";
		car1.size=15;
		car1.year=2020;
		
		
		Car car2= new Car();
		car2.make="Honda";
		car2.model="Civic";
		car2.size=10;
		car2.year=2010;
		
		System.out.println("Im driving "+car2.make+" "+car2.model+" "+car1.year);
		
		car1.accelerate();
		car1.stop();
		car2.accelerate();
		car1.drift();
}

	
}
