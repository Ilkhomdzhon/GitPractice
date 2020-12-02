package com.syntax.Map;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1001, "Ilhom");
		map.put(1002, "Malohat");
		map.put(1003, "Mahmud");
		map.put(1004, "Ibrohim");
		map.put(1005, "Ahmad");

		
		Set<Integer>keys=map.keySet();
			 
		 	Iterator<Integer>it=keys.iterator();
		 	while (it.hasNext()) {
		 		int k=it.next();
		 		System.out.println("Key is "+k+"and value is "+map.get(k));
		 	}
			
		
		 	Collection<String >collection=map.values();
		 	
		 	Iterator<String>ita=collection.iterator();
		 	
		 		 while (ita.hasNext()) {
		 			String a = ita.next();
		 			System.out.println(a);
		 		 }
		 	
		 	
		 	
	}
	
}
