package com.java.practise01;

public class NestedLoop {

	public static void main(String[] args) {
		 
		int [][] numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,},
				{12,13,14}
		};
		
		 for (int i=0; i<numbers.length; i++) {
			 for (int y=0; y<numbers[i].length;y++) {
				 
				 System.out.print(numbers[i][y]*2+" ");
			 }
			 System.out.println();
		 }
		
		 
	}

}
