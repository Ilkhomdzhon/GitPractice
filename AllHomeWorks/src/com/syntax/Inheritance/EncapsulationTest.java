package com.syntax.Inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class EncapsulationTest {

	public static void main(String[] args) {

		
			ArrayList<String >arrayList= new ArrayList<>();
			
			arrayList.add("HEllo");
			arrayList.add("Bye");
			arrayList.add("Ilhom");
			arrayList.add("Mahmud");
			arrayList.add("Ahmad");
			
			
			System.out.println(arrayList);
			
		
			int a =arrayList.size();
			 System.out.println(a);
			 
			 
			 arrayList.set(2, "Ibrohim");
			 
			 System.out.println(arrayList);
			 arrayList.set(0, "Ilhom");
			 arrayList.set(1, "Malohat");
			 System.out.println("========using for each loop==========");
//			 for (String string : arrayList) {
//				 System.out.println(string);
//				
//			}
			 
			 for (int i=0;i<arrayList.size();i++) {
				 String bb= arrayList.get(i);
				  System.out.println(bb);
				 
			 }
			 
}
}
