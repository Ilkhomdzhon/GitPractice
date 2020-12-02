package com.syntax.Inheritance;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>nums = new ArrayList<>();
		
			 nums.add(12);
			 nums.add(23);
			 nums.add(34);
			 nums.add(66);
			 nums.add(55);
			 nums.add(34);
			 
			 int sum = 0 ;
			 
			 for (int i=0;i<nums.size();i++) {
				 sum=sum+nums.get(i);
				 
			 }
			 System.out.println(sum);
		
	}

}
