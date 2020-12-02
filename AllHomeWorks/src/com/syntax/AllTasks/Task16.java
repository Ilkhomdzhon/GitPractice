package com.syntax.AllTasks;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task16 {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();

		map.put("1 item", "apple");
		map.put("2 item", "banana");
		map.put("3 item", "pear");
		map.put("4 item", "tomato");
		map.put("5 item", "mango");
		map.put("6 item", "kiwi");

		
			Set<Entry<String,String>>entry=map.entrySet();
			
				Iterator<Entry<String,String>>it=entry.iterator();
				
					 while (it.hasNext()) {
						 Entry<String,String>a=it.next();
						 
						 System.out.println("Key is "+a.getKey()+" values is "+a.getValue());
						 
					 }
		
	}

}
