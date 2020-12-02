package com.syntax.AllTasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task18 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

			Set<Entry<String ,String>>set = map.entrySet();
			
				 	for (Entry<String ,String >entry:set) {
				 		System.out.println(entry.getValue().toUpperCase());
				 	}
	}

}
