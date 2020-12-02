package com.syntax.REVIEW;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		
		String [][]  groceries = {{"Apple","Melon","Grape","Cherry"},
									{"Potato","Carrot","Onion","Redish"},
									{"Oil","Olive Oil","Flour","Salt"},
									{"Water","Matches","Paper","Oven"}
		
				
		};
		
		int sum = 0; 
		for (int i=0; i<groceries.length;i++) {
			for (int y=0;y<groceries[i].length;y++) {
				
				System.out.println(groceries[i][y]+" ");
			}
			sum = groceries[i].length+sum;
			
			System.out.println(sum);
		}
		
	}
}
