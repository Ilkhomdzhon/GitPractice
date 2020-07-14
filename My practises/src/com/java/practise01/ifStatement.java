package com.java.practise01;

import java.util.Scanner;

public class ifStatement {
	
	public static void main(String[] args) {
		
		//1. Write a Java program to get a number from the user and
		//print whether it is positive or negative

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number ");
		int num=input.nextInt();
		
		if (num>0) {
			System.out.println("Positive");
			
		}else if (num<0) {
			System.out.println("Negative");
			
			
		}else {
			System.out.println("Zero");
			
		}
		
		
	}

}
