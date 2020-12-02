package com.syntax.BigRecap;

import java.util.ArrayList;
import java.util.Iterator;

public class AddingEventoArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i <= 50; i++) {
			
			
			numbers.add(i);

		}
		
			 	Iterator<Integer> it= numbers.iterator();
			 	
			 		 while (it.hasNext()) {
			 			 if (it.next()%5==0) {
			 				it.remove();
			 				 
			 			 }
			 		 }
			 		 System.out.println(numbers);
			 	 
	}

}
