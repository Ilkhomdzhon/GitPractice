package com.syntax.java;

public class HomeWork159 {
	
//	Create a method hello() in parent class that will print "method in Parent class" 
//	then override  that method is 3 Subclasses implementing login to print 
//	"method in Child1/Child2/Child3 class"
////
//	In Main Class create 3 object of the child classes and store in into an array and call method hello():
//
//	Expected Output:
//	method in Child1 class
//	method in Child2 class
//	method in Child3 class

	
	public void hello() {
		System.out.println("method in Parent class");
	}
	  		
	

}

   class Child1 extends HomeWork159 {
	   @Override
	   public void hello() {
		   System.out.println("method in Child1 class");
	   }
}
   
  class Child2 extends HomeWork159{
	  
	  @Override
	  public void hello() {
		  System.out.println("method in Child2 class");
	  }  
  }
  
  class Child3 extends HomeWork159{
	  
	  
	  @Override
	  public void hello() {
		  System.out.println("method in Child3 class");
	  }
	  public static void main(String[] args) {
		
		  HomeWork159 child=new Child1();
		  child.hello();
		  
		  HomeWork159 chil=new Child2();
		  chil.hello();
		  
		  HomeWork159 chi=new Child3();
		  chi.hello();
		  
	}
  }
  
   
   