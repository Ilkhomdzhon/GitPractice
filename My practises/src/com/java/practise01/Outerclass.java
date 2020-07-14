package com.java.practise01;

public class Outerclass {
	
	 int a=10 ;
	 
	 
	 public class InnerClass{
		 
		  int b=15;
		  
	 }

	 
	 public static void main(String[] args) {
		
		 Outerclass myoutter=new Outerclass();
		 
		 Outerclass.InnerClass myInner = myoutter.new InnerClass();
		 
		 System.out.println(myoutter.a+myInner.b);
		 
		 
		 
	}
}
