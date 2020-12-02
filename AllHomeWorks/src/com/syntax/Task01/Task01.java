package com.syntax.Task01;

import java.util.*;

public class Task01 {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();

		set.add("Uzbekistan");
		set.add("Tajikistan");
		set.add("Kyrgyzstan");
		set.add("Turkmenistan");
		set.add("Kazakstan");
		set.add("Armenia");
		set.add("Bankok");

		System.out.println(set);

		for (String a : set) {
			System.out.println(a);
		}
		
		System.out.println("===========Iterator============");
		Iterator <String>b=set.iterator();
			 while(b.hasNext()) {
				String c= b.next();
				System.out.println(c);
			 }

	}

}
