package com.syntax.AllTasks;

import java.util.ArrayList;
import java.util.*;
import java.util.Map;

public class Task04 {

	public static void main(String[] args) {

		List<Map<String, Object>> dataList = new ArrayList<>();

		Map<String, Object> appleMap = new HashMap<>();

		appleMap.put("Item", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);

		dataList.add(appleMap);

		Map<String, Object> orangeMap = new LinkedHashMap<>();

		orangeMap.put("Item", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		
		dataList.add(orangeMap);
		
		
//			for (Map<String, Object> map : dataList) {
//				
//					String a= map.get("Item").toString();
//					map.get(key)
//			}

	}

}
