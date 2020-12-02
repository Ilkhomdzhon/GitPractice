package com.syntax.Map;

import java.util.*;

public class AllMaps {

	public static void main(String[] args) {

		Map<String, Integer> grocery = new HashMap<>();
		grocery.put("Tomato", 10);
		grocery.put("potato", 8);
		grocery.put("cucumber", 5);
		grocery.put("watermelon", 4);
		grocery.put("apple", 12);

		Map<String, Integer> household = new LinkedHashMap<>();

		household.put("Toilet paper", 20);
		household.put("Lysol", 12);
		household.put("Gloves", 3);
		household.put("Face Shield", 4);
		household.put("Mask", 100);

		Map<String, Integer> shopping = new TreeMap<>(grocery);

		shopping.putAll(household);

		System.out.println(shopping);

		Set<String> keys = shopping.keySet();

		for (String key : keys) {
			System.out.println("Key: " + key + " Values: " + shopping.get(key));
		}

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String a = it.next();
			System.out.println("Keys: " + a);

		}

		Collection<Integer> collec = household.values();
		System.out.println("Values:" + collec);
		
		
			 collec.iterator();

	}
	
		 	 
}
