package com.syntax.java;

public class HomeWork162 {
	
//		For you to do:
//		Overload 2 final instance methods:
//		Call them in main method
//		Expected Output:
//		Final method with boolean parameter
//		Final method with String parameter
	
	
	
	final void bool (boolean flag) {
		System.out.println("Final method with boolean parameter");
		
	}  
	  final void string(String str) {
		  System.out.println("Final method with String parameter");
	  }
	  
	  
	  public static void main(String[] args) {
		  
		  HomeWork162 obj=new HomeWork162();
		  obj.bool(true);
		  obj.string("b");
		
	}

}
