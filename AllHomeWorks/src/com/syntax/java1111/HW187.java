package com.syntax.java1111;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.TreeSet;

public class HW187 {

	public static void main(String[] args) throws FileNotFoundException {
		
		  FileInputStream fis= new FileInputStream("");
		  

		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		Iterator it = map.iterator();
		while (it.hasNext() )
		{
		System.out.print( it.next() + " " );
		 
		
		
		}
		
		
		
	}

}
