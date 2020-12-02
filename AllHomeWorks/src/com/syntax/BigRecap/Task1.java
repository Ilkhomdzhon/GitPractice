package com.syntax.BigRecap;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		
		ArrayList <String > list = new ArrayList<>();
		
		
			list.add("Assalomu -aleykum");
		 	list.add("Merhabe");
		 	list.add("Zdrastvuyte");
		 	list.add("Hello");
		 	list.add("Jakshy Synby");
		 	
		 	
		 	//System.out.println(list);
		 		 Iterator<String> task=list.iterator();
		 		 	
		 		while (task.hasNext()) {
		 			if (task.next().endsWith("y")) {
		 				task.remove();
		 			}
		 		}
		 		 System.out.println(list);
		
		
		
	}

}
