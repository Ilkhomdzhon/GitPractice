package com.syntax.java1;

public class HomeWork140 {
	
	/* 1. Complete the Employee.java class:

Include the following class variables:

Write two constructors:
* non-argument constructor
* parameterized constructor that will initialize all instance variables
Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.

Output:
 
null null 0 null 0

	 */

	
	String name ,lastName, startDate;
	int employeeID, salary;
	
	 public HomeWork140() {
		 
		 System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
	 }
	 
	 public HomeWork140(String name ,String lastName, int employeeID,String startDate,int salary) {
	
		 this.name=name;
		 this.lastName=lastName;
		 this.employeeID=employeeID;
		 this.startDate=startDate;
		 this.salary=salary;
		 
	 }
	 
	 void displayInfo() {
		 System.out.println(name+" "+lastName+" "+employeeID+" "+startDate+" "+salary);
	 }
	 
	 public static void main(String[] args) {
		
		 HomeWork140 obj= new HomeWork140();
	
		 //Joe Smith 12345 01/01/1970 35000
		 
		 HomeWork140 obj1 = new HomeWork140("John","Smith",12345,"01/01/1970",35000);
		 obj1.displayInfo();
	}
	
}
