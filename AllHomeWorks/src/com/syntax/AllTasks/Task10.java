package com.syntax.AllTasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task10 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		set.add(111);
		set.add(111);
		set.add(111);
		set.add(111);
		set.add(999);
		set.add(999);
		set.add(999);
		set.add(444);
		set.add(444);
		set.add(444);
		
		System.out.println(set);
		
		
			 	Iterator<Integer>it= set.iterator();
			 	 	while (it.hasNext()) {
			 	 		int a =it.next();
			 	 		System.out.print(a+" ");
			 	 		
			 	 	}
		

	}
}
