package com.java.practise01;

public class Calla {
	 
	 int a ;
	  int b ;
	  
	  void add (int a , int b ) {
		  System.out.println(a+b);
		  
	  }
	  
	  void sub (int a ,int b ) {
		  System.out.println(a-b);
	  }
    void mul(int a , int b ) {
    	System.out.println(a*b);
    	
    }
    public static void main(String[] args) {
    	
    	Calla cal=new Calla();
    	 
    	cal.add(45, 34);
		cal.sub(77, 66);
		cal.mul(45, 45);
		
	}
    
}
