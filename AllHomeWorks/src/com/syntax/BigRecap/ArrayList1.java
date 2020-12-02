package com.syntax.BigRecap;

import java.util.*;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();

		name.add("Ilhom");
		name.add("Malohot");
		name.add("Mahmud");
		name.add("Ibrohim");
		name.add("Ahmad");
		name.add("Mahmud");
		name.add("Ibrohim");
		name.add("Ahmad");

		Set<String> set = new LinkedHashSet<>();

		set.addAll(name);

		System.out.println(set);
		
		
		List<String> list= new ArrayList<>();
		
			 list.addAll(set);
			 
			 System.out.println(list.get(0));
			 
			 
			 System.out.println(list);
//			 
//			 Object [] i=list.toArray();
//			System.out.println(i[0]);
//			 
	
	}

}
