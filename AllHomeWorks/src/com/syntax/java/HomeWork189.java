package com.syntax.java;

import java.util.HashSet;
import java.util.Set;


public class HomeWork189 {

	public static void main(String[] args) {
		
		 
		
//	Create a Set and and below values to it. 
		/// [third, first, second]

//				 Print HashSet and then remove all the elements from Hashset and print it again.
//
//				 Expected Output:
//				 [third, first, second]
//				 []
	      
				Set<String>set=new HashSet<>();
				
				set.add("third");
				set.add("first");
				set.add("second");
				
				System.out.println(set);
		         
				set.removeAll(set);
                System.out.println(set);
                
}
}

