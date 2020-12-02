package com.syntax.ReplmixExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class Countries {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		  	list.add("Tajikistan");
		  	list.add("USA");
		  	list.add("Kazakstan");
		  	list.add("Uzbekistan");
		  	list.add("Urugvay");
		  	list.add("Azerbaijan");
		  	
		  	
		  		Iterator<String>iter= list.iterator();
		  			while(iter.hasNext()) {
		  				if (iter.next().contains("U")) {
		  					iter.remove();
		  				}
		  				
		  			}
		  			System.out.println(list);
		  
			 		
		
	}

}
