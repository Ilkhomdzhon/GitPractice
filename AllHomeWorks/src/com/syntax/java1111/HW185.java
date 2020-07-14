package com.syntax.java1111;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HW185 {

	public static void main(String[] args) {
		
			
				  List<Boolean>listA=new LinkedList<>();
				  listA.add(true);
				  listA.add(false);
				  listA.add(false);
			 
				   List<Boolean>listB=new LinkedList<>(listA);
				   
			 System.out.println(listA);
			 
			Iterator<Boolean> it=listA.iterator();
		 
			 while(it.hasNext()) {
				 boolean bool=it.next();
				 System.out.println(bool);
			 }

	}

}
