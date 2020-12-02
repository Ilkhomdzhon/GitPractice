package com.syntax.Task01;

import java.util.*;

public class Task02 {

	public static void main(String[] args) {

		Set<String> lset = new LinkedHashSet<>();

		lset.add("Dushanbe");
		lset.add("Bishkek");
		lset.add("Astana");
		lset.add("Ashgabat");
		lset.add("Minsk");
		lset.add("Fairfax");

		System.out.println(lset);

		System.out.println("=========Iterator==========");
		Iterator<String> iter = lset.iterator();
		while (iter.hasNext()) {
			if (iter.next().contains("A")) {
				iter.remove();
				
			}
			System.out.println(lset);

		}

	}

}
