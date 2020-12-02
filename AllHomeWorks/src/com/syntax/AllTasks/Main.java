package com.syntax.AllTasks;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void display(Map<String, Integer> map) {

		if (map.isEmpty()) {
			System.out.println("Map is Empty");
		} else {

				 for (Entry<String,Integer> a:map.entrySet()){
					 	
					 	 System.out.println(a.getKey()+" = "+a.getValue());
					 
				 }
		}

	}

}
