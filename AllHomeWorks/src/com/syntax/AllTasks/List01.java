package com.syntax.AllTasks;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		
		List <String > list = new ArrayList<>();
		boolean a=list.isEmpty();
		
		System.out.println(a);
		
		list.add("Syntax");
		
			boolean b = list.isEmpty();
		System.out.println(b);

	}

}
