package com.syntax.Map;

import java.util.*;

import java.util.Map.Entry;

public class MapOfCountry {

	public static void main(String[] args) {

		Map<String, String> state = new TreeMap<>();

		state.put("Virginia", "Richmond");
		state.put("Texas", "Dallas");
		state.put("Arkansa", "Little Rock");
		state.put("California", "Sacramento");
		state.put("Colorado", "Denver");
		state.put("Georgia", "Atlanta");
		state.put("Idaho", "Boise");
		state.put("Kansas", "Topeko");

		System.out.println("================Loop=================== ");
		Set<Entry<String, String>> capital = state.entrySet();

		for (Entry<String, String> cap : capital) {
			String a = cap.getKey();

			String b = cap.getValue();

			System.out.println(a + " : " + b);

		}

		System.out.println("===============Iterator ================");
		Iterator<Entry<String, String>> it = capital.iterator();

		while (it.hasNext()) {
			Entry<String, String> cc = it.next();

			System.out.println(cc.getKey() + " : " + cc.getValue());
		}

	}

}
