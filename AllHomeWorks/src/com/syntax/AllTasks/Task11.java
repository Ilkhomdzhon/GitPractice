package com.syntax.AllTasks;

import java.util.HashSet;
import java.util.Set;

public class Task11 {

	public static void main(String[] args) {

		
		Set <String > set = new HashSet<>();
		
		 set.add("first");
		 set.add("second");
		 set.add("thirs");
		 
		 System.out.println(set);
		
		 
		 set.removeAll(set);
		 System.out.println(set);
		 
		
	}

}
