package com.syntax.java;

import java.util.Scanner;

public class HW28 {

	public static void main(String[] args) {
//		For you to do: 
//			Write a program to take values of length and width from the user.
//			Based on value define whether the shape is a square or rectangle. 
//
//			Examples:
//			Please enter the length 18
//			Please enter the width 16
//			The shape of your object is rectangle
//
//			Please enter the length 16 
//			Please enter the width 16 
//			The shape of your object is square
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter the length");
		int length=scan.nextInt();
		
		System.out.println("Please enter the width");
		int width=scan.nextInt();
		
		if (length>=18 && width<=16) {
			System.out.println("The shape of your object is rectangle");
		
		}else if (length<=16 && width<=16) {
			System.out.println("The shape of your object is square");
		}
		
	}

}
