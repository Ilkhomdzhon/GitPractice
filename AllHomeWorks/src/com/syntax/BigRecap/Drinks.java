package com.syntax.BigRecap;

import java.util.ArrayList;
import java.util.Iterator;

public class Drinks {
	public static void main(String[] args) {
		
	
	
	
	ArrayList<String > drink= new ArrayList<>();
		 
	 	drink.add("Coca-cola");
	 	drink.add("Fanta");
	 	drink.add("Sprite");
	 	drink.add("Vodka");
	 	drink.add("Tea");
	 	drink.add("Spirt");
	 	
	 	
//	 	Iterator <String>it=drink.iterator();
//	 		while(it.hasNext()) {
//	 			if (drink.contains("e") && drink.contains("a")) {
//	 				System.out.println(it.next());
//	 				
//	 				
//	 			}
//	 		}
//	 		
	 		 for (int i=0;i<drink.size();i++) {
	 			 if (drink.get(i).contains("e")|| drink.get(i).contains("a")) {
	 				 drink.set(i, "water");
	 				 
	 			 }
	 		 }
	
	 		 	 System.out.println(drink);
	
	}

}
