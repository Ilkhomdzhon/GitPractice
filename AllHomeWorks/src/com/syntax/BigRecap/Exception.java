package com.syntax.BigRecap;

public class Exception {

	public static void main(String[] args) {
		
			
		 	 String str = "Hello";
		 	 try {
		 	 char character=str.charAt(12);
		 	 
		 	 	System.out.println(character);
		 	 }catch(RuntimeException ex) {
		 		 	ex.printStackTrace();
		 		 
		 	 }
		 	 
		 	 

	}

}
