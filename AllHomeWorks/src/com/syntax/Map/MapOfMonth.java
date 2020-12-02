package com.syntax.Map;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class MapOfMonth {

	public static void main(String[] args) {

		Map<String, Integer> month = new LinkedHashMap<>();

		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 20);
		month.put("May", 31);
		month.put("June", 30);
		month.put("July", 30);
		month.put("August", 31);
		month.put("September", 30);
		month.put("October", 31);
		month.put("November", 30);
		month.put("December", 31);

		Set<Entry<String, Integer>> entry = month.entrySet(); 

		for (Entry<String, Integer> en : entry) {

			System.out.println("Key : " + en.getKey() + " Value :" + en.getValue());
		}

		Iterator<Entry<String, Integer>> it = entry.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next().getKey()+" Value : "+it.next().getValue());this method will give you error mismatch of key and value
			
			Entry<String,Integer>newEntry=it.next();
			System.out.println(newEntry.getKey()+" : "+newEntry.getValue());
			
		}

	}
}
