package com.syntax.java1;

public class HomeWork152 {

	/*
	 * Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers In
	 * main method execute all 3 methods to match the output:
	 * 
	 * Expected Output 40 (should come from subtracting 4 numbers) 30 (should come
	 * from subtracting 3 numbers) 20 (should come from subtracting 2 numbers)
	 */

	public void sub(int a, int b, int c, int d) {

		System.out.println(a - b - c - d);

	}

	public void sub(int a, int b, int c) {
		 
			 System.out.println(a-b-c);
	}
	
	public void sub(int a , int b ) {
		
		System.out.println(a-b);
		
	}
	
		 public static void main(String[] args) {
			 
			 
			 HomeWork152  aaa = new HomeWork152();
			 aaa.sub(23, 10);
			 aaa.sub(30, 20, 10);
			 aaa.sub(50, 10, 10, 10);
			
		}
}
	
 
	 
