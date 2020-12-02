package com.syntax.java1;

public class HomeWork085 {

	public static void main(String[] args) {

		/*
		 * For you to do: Write a program that sums all numbers that are on even index
		 * and on even row.
		 * 
		 * Expected Output: -4
		 * 
		 */

		{
			int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			
			int sum = 0 ; 
			
			for (int i=0; i<a.length;i++) {
				
				for (int y=0; y<a[i].length;y++) {
					
					if (i%2==0 && y%2==0) {
						
						sum=sum+a[i][y];
					}
					
					
				}
			
			}
			System.out.println(sum);
		
	}

}
}
