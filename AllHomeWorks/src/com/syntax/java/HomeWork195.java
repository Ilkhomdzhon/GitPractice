package com.syntax.java;
import java.util.*;
public class HomeWork195 {
	
	///class Employee{
		  
	//getters to have an access to instance variables
	
	static String fullName;
    static  int ssn;
	static double salary ;
	  
	  public  void cons(String fullName,int ssn,double salary){
	    this.fullName=fullName;
	    this.ssn=ssn;
	    this.salary=salary;
		  
	  }
		
    public String getfullName() {
    	return fullName;
    	
    }
    
     public int getSsn() {
    	 return ssn;
    	 
     }
     
     public double getSalary() {
    	 return salary;
    	 
     }
     
     public static void main(String[] args) {
    	 // Create a set collection that will store # objects of Employee type and using 
    	 //Iterator print the value of each variable
    	 
//    	 John Doe
//    	 123456789
//    	 80000.0
//    	 Jane Smith
//    	 987654321
//    	 90000.0
//    	 Jackie Chan
//    	 0
//    	 1000000.0
//     
    	 Set<HomeWork195> Employee = new HashSet<>();
    	 
    	 HomeWork195.fullName="John Doe";
    	 HomeWork195.ssn=123456789;
    	 HomeWork195.salary=80000.0;
    	 
    	 HomeWork195.fullName="Jane Smith";
    	 HomeWork195.ssn=987654321;
    	 HomeWork195.salary=90000.0; 
    	 
    	 HomeWork195.fullName="Jackie Chan";
    	 HomeWork195.ssn=0;
    	 HomeWork195.salary=1000000.0; 
    	 
    	 
    	 
    	 
    	 
	}

}


