package com.syntax.BigRecap;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractise {
	
	
	public static void main(String[] args) {
		
		
		ArrayList <Integer> year =new ArrayList<>();
		
			 year.add(1986);
			 year.add(1989);
			 year.add(2012);
			 year.add(2014);
			 year.add(2016);
			 
			 
			 Iterator<Integer> it =year.iterator();
			 
			 	 while (it.hasNext()) {
			 		 Integer b=it.next();
			 		 System.out.println(b);
			 		 
			 	 }
			 
		
		
		
	}

}
