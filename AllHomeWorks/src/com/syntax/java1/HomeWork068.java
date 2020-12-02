package com.syntax.java1;

public class HomeWork068 {

	public static void main(String[] args) {

		/*
		 * Instructions from your teacher: For you to do: Write a program to print out
		 * the pattern:
		 * 
		 * 
		 * $$$$ $ $ $ $ $$$$
		 */

		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= 4; j++) {
				
				if (j == 1||j==3) {
					System.out.print("$");
				}else if (i==1||i==4) {
					System.out.print("$");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		}
				

		
		
		
	}


