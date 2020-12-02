package com.syntax.Map;

import java.util.*;
import java.util.Map.Entry;

public class BestBuyMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(766847, "Printer");
		map.put(766848, "Monitor");
		map.put(766823, "Macbook");
		map.put(766844, "HP laptop");
		map.put(766821, "TV");
		map.put(766822, "Iphone");
		map.put(766890, "Speakers");

		Set<Entry<Integer, String>> best = map.entrySet();

		for (Entry<Integer, String> buy : best) {

			int a = buy.getKey();
			String b = buy.getValue();
			System.out.println("Item ID : " + a + " Item discription : " + b);

		}

		Iterator<Entry<Integer, String>> it = best.iterator();
		
			 while (it.hasNext()) {
				Entry<Integer,String>cc=it.next();
					 System.out.println(cc.getKey()+" : "+cc.getValue());
					 
			 }
	}
}
