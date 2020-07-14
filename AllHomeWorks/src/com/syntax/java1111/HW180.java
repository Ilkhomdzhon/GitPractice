package com.syntax.java1111;

import java.util.ArrayList;
import java.util.List;

public class HW180 {

	public static void main(String[] args) {
		
		
		 List<Integer> list=new ArrayList<>();
		 
		 list.add(111);
		 list.add(222);
		 list.add(333);
		 list.add(444);
		 list.add(555);
		 list.add(666);
		 
		  System.out.println(list);
		  list.removeAll(list);
		  System.out.println(list);
		 
		
		

	}

}
