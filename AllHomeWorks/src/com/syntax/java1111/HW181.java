package com.syntax.java1111;
import java.util.*;
public class HW181 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		 list.add("hi");
		 list.add("yo");
		 list.add("sup");
		 list.add("yolo");
		 list.add("boop");
		 
		for (int i=0;i<list.size();i+=1) {
			 list.remove(i);
			
		}
		 System.out.println(list);
		
		 
	}

}
