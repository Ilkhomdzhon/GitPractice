package com.syntax.ReplmixExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class BooleanValue {

	public static void main(String[] args) {
		
		ArrayList<Boolean>listA = new ArrayList<>();
		 
			 listA.add(true);
			 listA.add(false);
			 listA.add(false);
			 
			 ArrayList<Boolean>listB = new ArrayList<>();
			 
			 	 listB.addAll(listA);
			 	 
			 	 Iterator<Boolean>it= listB.iterator();
			 	 	while(it.hasNext()) {
			 	 		Boolean a=it.next();
			 	 		
			 	 		System.out.println(a);
			 	 	}
			 	 
			 	 
	}

}
