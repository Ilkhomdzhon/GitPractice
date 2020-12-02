package com.syntax.REVIEWMETHOD;

public class AllPhone {
	
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		
		phone.brand="Apple";
		phone.model="Iphone";
		phone.year = 2020;
		
		phone.call();
		phone.recordCall();
		phone.takePic();
		
		
		
		
		Phone android = new Phone();
		
		android.brand="Nokia";
		android.model ="C100";
		android.year=1990;
		
		android.call();
		android.recordCall();
		android.takePic();
		
		
		
		Phone nokia = new Phone ();
		
		nokia.brand = "Symbian";
		nokia.model = "Rezerve";
		nokia.year = 1980;
		
		nokia.call();
		nokia.recordCall();
		nokia.takePic();
		
		
			
		
		
		
	}

}
