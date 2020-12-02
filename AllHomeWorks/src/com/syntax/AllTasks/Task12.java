package com.syntax.AllTasks;

import java.util.HashSet;
import java.util.Set;

public class Task12 {
	
	public static void main(String[] args) {
		
		Set <String >set = new HashSet<>();
		
			 set.add("Yellow ");
			 set.add("Black");
			 set.add("Blue ");
			 set.add("Pink");
			 set.add("White");
			 
			int size= set.size();
			
			
			System.out.println(set);
			System.out.println("The size of HashSet is ->"+size);
			 
		
	}

}
