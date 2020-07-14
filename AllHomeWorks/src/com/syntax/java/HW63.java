package com.syntax.java;

import java.util.Scanner;

public class HW63 {

	public static void main(String[] args) {
//		Given the following inputs:
//			int x;
//
//			Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
//
//			Example Output:
//			In: 3
//			0 1 2
//
//			In: 8
//			0 1 2 3 4 5 6 7
//
//			In: 5
//			0 1 2 3 4
		int num;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Int x");
		num=scan.nextInt();
		
		for (int i=1;i<num;i++) {
			System.out.print(i+" ");
			
		}
		


	}

}
