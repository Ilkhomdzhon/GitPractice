package com.syntax.java;

import java.util.Scanner;

public class BigFRecap {
	
	
	public static void main(String[] args) {
		
		Scanner scan ;
		boolean answer ;
		double balance ;
		
		scan = new Scanner (System.in);
		System.out.println("Do u have CC ?");
		answer = scan.nextBoolean();
		
		if (answer) {
			System.out.println("What is your balance");
			balance = scan.nextDouble();
			
			if (balance>1000) {
				System.out.println("Pay it off immidiatly");
				
			}else {
				System.out.println("GO to VA beach");
			}
			
		}else {
			System.out.println("Do you need Credit card ?");
			balance = scan.nextDouble();
			
			
			System.out.println("what is your credit score?");
			
			
		}
		
		
		
		
	}
}
