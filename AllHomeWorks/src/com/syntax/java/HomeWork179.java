package com.syntax.java;

import java.util.ArrayList;

public class HomeWork179 {

	public static void main(String[] args) {
//		ArrayList Loop
//		Create an arrayList of type Integer. 
//
//		add below values. 
//		111
//		111
//		111
//		999
//		999
//		999
//
//		Print all the values of List 1 by 1:
//
//		Expected Output:
//		111
//		111
//		111
//		999
//		999
//		999
		
		ArrayList<Integer>list=new ArrayList<>();
		
		 list.add(111);
		 list.add(111);
		 list.add(111);
		 list.add(999);
		 list.add(999);
		 list.add(999);
		 
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
	}

}
