package com.syntax.java;

import java.util.ArrayList;

public class HomeWork181 {

	public static void main(String[] args) {
		
//		Create an array list to type String. 
//		Add these values below to your arraylist
//		hi
//		yo
//		sup
//		yolo
//		boop
//
//		Remove 1, 3, 5 element from an array
//
//		print remained values one by one in one line
//
//		Expected Output:
//		yo yolo
		
		ArrayList<String>al=new ArrayList<>();
		al.add("hi");
		al.add("yo");
		al.add("sup");
		al.add("yolo");
		al.add("boop");
		
		 for (int i=0;i<al.size();i+=1) {
		al.remove(i);
			 
		 }
		 System.out.println(al);
		
	}

}
