package com.java.practise01;

public class Phone {
	
	
	String model ;
	String make ;
	String type ;
	int year ;
	int size ;
	
	void Call() {
		System.out.println(model+" can call");
	}
	void image() {
		System.out.println(model+" can take picture ");
		
	}void music(){
		System.out.println(model+" can play music");
		
	}

	 public static void main(String[] args) {
		
		 Phone Iphone =new Phone();
		 Iphone.make="Iphone";
		 Iphone.model="X";
		 Iphone.size=15;
		 Iphone.year=2018;
		 
		 Iphone.music();
		 Iphone.image();
		 Iphone.Call();
		 
		 
		 
	}
}
