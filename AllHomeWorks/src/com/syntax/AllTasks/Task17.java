package com.syntax.AllTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task17 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("mango", 20);
		map.put("apple", 30);
		map.put("orange", 20);
		map.put("mango", 40);
		map.put("mango", 40);
		
		
			Set<Entry<String , Integer>>set= map.entrySet();
			
				 for (Entry<String, Integer> entry : set) {
					
					 	String a = entry.getKey();
					 	int b=entry.getValue();
					 	
					 	System.out.println("Key = "+a+" and value = "+b);
				}
				 
			
	}

}
