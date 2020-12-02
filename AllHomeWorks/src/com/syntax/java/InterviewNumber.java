package com.syntax.java;

import java.util.Arrays;

public class InterviewNumber {

	public static void main(String[] args) {
		
	int [] numbers= {100,20,30,40,50};
	
	Arrays.sort(numbers);

	 	System.out.println("Smallest "+numbers[0]);
	 	System.out.println("Largest "+numbers[numbers.length-1]);
		System.out.println("Second largest "+numbers[numbers.length-2]);
	}
	

}
