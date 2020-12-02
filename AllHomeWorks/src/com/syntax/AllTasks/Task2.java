package com.syntax.AllTasks;

import java.util.*;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) {

		Map<String, String> map = new LinkedHashMap<>();

		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		
		 	 map.replace("THREE", "CCC", "ASEL");
		 	 map.replace("FOUR", "SUMAIR");
		
		Set<Entry<String , String>>set=map.entrySet();
			 
//				 for (Entry<String,String> a:set) {
//					 
//					 System.out.println(a);
//				 }
				 
				Iterator<Entry<String,String>>it=set.iterator();
					
				 	 	while (it.hasNext()) {
				 	 		Entry<String ,String>g=it.next();
				 	 		
				 	 		String cc=g.getKey();
				 	 		String vv=g.getValue();
				 	 		System.out.println(cc+":"+vv);
				 	 	}
		 	
	}
}
