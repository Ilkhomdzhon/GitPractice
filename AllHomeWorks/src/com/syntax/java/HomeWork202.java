 package com.syntax.java;
import java.util.*;
import java.util.Map.Entry;
public class HomeWork202 {
	public static void main(String[] args) {
//		Expected Output:
//			HashMap Before Remove :
//			FIVE : EEE
//			ONE : AAA
//			FOUR : DDD
//			TWO : BBB
//			THREE : CCC
//			------------------
//			HashMap After Remove :
//			FIVE : EEE
//			TWO : BBB
//			THREE : CCC
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		
		//System.out.println(map.size());
		
		
		
		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry str : entries) {
			System.out.println(str.getKey()+":"+str.getValue());
		}
		System.out.println("-----------------------------");
		map.remove("ONE","AAA");
		map.remove("FOUR","DDD");
		Iterator<Entry<String, String>> it = entries.iterator();
		while(it.hasNext()) {
			
			Entry<String, String>entry=it.next();
			System.out.println(entry);
			
	  }
	}
}