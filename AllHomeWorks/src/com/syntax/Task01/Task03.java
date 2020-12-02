package com.syntax.Task01;

import java.util.*;
import java.util.Set;

public class Task03 {

	public static void main(String[] args) {
		
		
		Set<String > set = new HashSet<>();
			 
			 set.add("Syntax Student");
			 set.add("Collge Student");
			 set.add("University student");
			 set.add("Stanfford University");
			 set.add("Garvard Student");
			 
			 
			 System.out.println(set);
			 
			 
			Iterator<String>it= set.iterator();
		
				 while (it.hasNext()) {
					 String v=it.next();
					 System.out.println(v);
				 }
		
System.out.println("---------------for advanced loop=============");
				 	 
				 	 for (String string : set) {
				 		 
				 		 System.out.println(string);
						
					}
	}

}
