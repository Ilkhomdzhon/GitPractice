package com.syntax.REVIEWMETHOD;

public class Phone {
	
	String brand ;
	String model ;
	int year ; 
	
	
	void call() {
		System.out.println("My"+brand+"is"+model+"and its year"+year);
	}
	
	void takePic() {
		System.out.println("My "+brand+" can take a picture");
		
	}
	
	 void recordCall() {
		 System.out.println("My"+brand +" can record phone calls its year of "+year);
	 }

}
