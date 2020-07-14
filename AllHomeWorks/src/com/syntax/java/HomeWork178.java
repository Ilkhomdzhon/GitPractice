package com.syntax.java;

import java.util.ArrayList;

public class HomeWork178 {

	public static void main(String[] args) {
//		Create a array list that will hold Integer Objects:
//			Add below elements to it. 
//			111
//			222
//			333
//			444
//			555
//			666
//
//			Print first, third and fifth element from your array
//
//			Expected Output:
//			111
//			333
//			555
		
		 ArrayList<Integer>ar=new ArrayList<>();
		 ar.add(111);
		 ar.add(222);
		 ar.add(333);
		 ar.add(444);
		 ar.add(444);
		 ar.add(555);
		 ar.add(666);
		 
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		 System.out.println(ar.get(5));
		

	}

}
