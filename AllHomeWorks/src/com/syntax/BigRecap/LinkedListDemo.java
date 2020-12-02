package com.syntax.BigRecap;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		
		LinkedList <String> llist = new LinkedList<>();
		
		llist.add("Ilhom");
		llist.add("Malohat");
		llist.add("Mahmud");
		llist.add("Ibrohim");
		llist.add("Ahmad");
		
			 for (int i=0;i<llist.size();i++) {
				 System.out.println(llist.get(i));
				 
			 }
			 
			 	 System.out.println("=====advanced loop=======");
			for (String a:llist) {
				System.out.println(a);
			}
			
			System.out.println("=========Iterator=======");
				Iterator<String>it= llist.iterator();
				while(it.hasNext()) {
					String b=it.next();
					System.out.println(b);
					System.out.println("----------------------");
				}

				
				
				LinkedList<Food > food= new LinkedList<>();
				
					 food.add(new Tajikistan("Osh","Tajik"));
					 food.add(new Russia("Uxa","Russian"));
					 food.add(new Turkey("Baklava","Turks"));
					 
					 	 
					  for (Food foo:food) {
						  foo.foodLike();
						  foo.guest();
						  foo.guest();
						  
						  
						  System.out.println("----------------------");
					  }
				 
				
				
	}

}
