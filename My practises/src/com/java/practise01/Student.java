package com.java.practise01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Student {
	
//	Create a student class that will have 
//	variables as studentId, name and lastName
//	constructor
//	method to display students details
//
//	Create a set that will store 5 different students in an order they been added to the collection.
//
//	Execute method to display students details
//
//	Expected Output:
//	Student details: Samir Jawaid with id: 101
//	Student details: Asel Umurzakova with id: 102
//	Student details: Diego Juarez with id: 103
//	Student details: Sohil Aryan with id: 104
//	Student details: Alijon Nazarov with id: 105
//	
	public int studentID;
	public String name, lastName;
	
	public void Constructor(int studentID,String name,String lastName) {
		 this.studentID=studentID;
		 this.name=name;
		 this.lastName=lastName;	 
	}
	
	 public void studentDetail() {
		 System.out.println("Student details: "+name+" "+lastName+" with id: "+studentID);
	 }
	 

	 public static void main(String[] args) {
		 
		 
		
	}
}
