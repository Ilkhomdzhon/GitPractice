package com.syntax.java;

import java.util.LinkedList;

public class HomeWork185 {

	public static void main(String[] args) {
//		
//		Create an ArrayList of type boolean called listA and add below values
//		(true, false, false)
//
//		Create another array list call listB and ad all values from List A into it
//
//		Using iterator print all values from ListB 1 by 1
//
//		Expected Output:
//		true
//		false
//		false
		LinkedList<Boolean> listA=new LinkedList<>();
		
	   listA.add(true);
	   listA.add(false);
	   listA.add(false);
	   
	   LinkedList<Boolean>listB=new LinkedList<>();
	   
	   listB.add(true);
	   listB.add(false);
	   listB.add(false);
	   
	    boolean a=listB.contains(true);
	    boolean b= listB.isEmpty();
	    boolean c= listB.isEmpty();
		
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	}

}
