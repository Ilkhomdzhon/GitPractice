package com.java.practise01;

import java.util.Scanner;

public class TwoNameHalf {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("What is Mom's first name ");
		String name=scan.nextLine();
		
		System.out.println("What is Dad's first name");
		String name1=scan.nextLine();
		
		System.out.println("Boy or Girl");
		String babyName=scan.nextLine();
		
		String SuggestedBname=null;
		int half1=name.length()/2;
		int half2=name1.length()/2;
		
		if (babyName.equalsIgnoreCase("Girl")) {
			SuggestedBname=name.substring(0, half1)+name1.substring(half2);
			System.out.println(SuggestedBname);
			
			
		}else if (babyName.equalsIgnoreCase("Boy")) {
			SuggestedBname=name.substring(0, half2)+name1.substring(half1);
			      System.out.println(SuggestedBname);
			      
			      
			
		}
		
		

	}

}
