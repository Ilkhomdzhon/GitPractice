package com.syntax.AllTasks;

import java.util.ArrayList;
import java.util.List;



public class List04 {

	public static void main(String[] args) {
		
		List <Integer> list=new ArrayList<>();
		
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
