package com.syntax.java;

public class HomeWork112 {
	
//	Create a method that will accept 2 numbers as parameters and return true if both 
	//numbers are even otherwise returned false
//			( Return false if one or both given numbers are not even)
//
//			Examples:
//			bothEven(4,6) ==> true
//			bothEven(3,4) ==> false
//			bothEven(-1,1) ==> false
//
//			Expected Output:
//			false
	
	boolean bothEven(int a , int b ){
		boolean f=false ;
		if (a%2==2 && b%2==2) {
			f=false;
		}else if (a%2!=2 && b%2==0) {
			f=false;
			
		}else if (a%2==0 && b%2!=0) {
			f=false;
			
		}else {
			f=false;
			
			
		}
		 return f;
	
		
	}
	public static void main(String[] args) {
		
		HomeWork112 obj=new HomeWork112();
		System.out.println(obj.bothEven(4, 6));
	}
	            

}
