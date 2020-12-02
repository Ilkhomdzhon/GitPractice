package com.syntax.AllTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		
		List <Integer> list =new ArrayList<>();
		
			 list.add(111);
			 list.add(111);
			 list.add(111);
			 list.add(999);
			 list.add(999);
			 list.add(999);
			 
			 Iterator<Integer>iter=list.iterator();
			 while (iter.hasNext()) {
				Integer b= iter.next();
				System.out.println(b);
			 }
		
		
		

	}

}
