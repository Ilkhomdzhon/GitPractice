package com.syntax.AllTasks;

import java.util.Map;
import java.util.Map.Entry;

public class Task03 {

	public static void display(Map<String, Integer> map) {

		if (map.isEmpty()) {
			System.out.println("Map is Empty");
		} else {

			for (Entry<String, Integer> e : map.entrySet()) {
				System.out.println(e.getKey() + ":" + e.getValue());

			}
		}

	}

}
