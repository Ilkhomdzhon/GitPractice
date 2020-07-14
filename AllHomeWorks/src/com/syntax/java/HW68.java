package com.syntax.java;

public class HW68 {


		
	//	For you to do: 
//			Write a program to print out the pattern: 
//			$$$$
//			$  $
//			$  $
//			$$$$
			
		public static void main(String[] args) {
	
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
