package com.syntax.AllTasks;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.Map.Entry;

public class task01 {
	
	
	public static void main(String[] args) {
		
		Map<String ,String>map =new LinkedHashMap<>();
		
			 map.put("Street", "Patrick ST");
			 map.put("Suite", "265");
			 map.put("City", "Vienna");
			 map.put("Country", "United States");
			 
			 	 System.out.println(map.size());
			 
			 	 Set<Entry<String,String>>set = map.entrySet();
			 	 	 
			 	 	for (Entry<String, String> set1   : set) {
						
			 	 		String a = set1.getKey();
			 	 		
			 	 		String b=set1.getValue();
			 	 		
			 	 		System.out.println(a+":"+b);
			 	 		
					}
		
		
		
	}

}
