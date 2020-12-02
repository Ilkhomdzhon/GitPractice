package com.syntax.java;

import java.util.ArrayList;
import java.util.HashSet;

public class INterviewDuplicate {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		//System.out.println(aList);
		
		HashSet<String> set = new HashSet(aList);
		
		System.out.println(set);
		

	}

}
