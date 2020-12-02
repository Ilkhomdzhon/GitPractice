package com.syntax.REVIEW;

public class LargestInMethods {

	int getLargest(int[] array) {

		int largest = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > largest) {
				largest = array[i];

			}
		}
		return largest;

	}	
	 	 public static void main(String[] args) {
			
	 		LargestInMethods rv= new LargestInMethods();
	 		
	 			 int [] ar = {34,33,44,555,333,2222,31};
	 			 
	 			 	int q= rv.getLargest(ar);
	 			 	System.out.println(q);
	 			 	 
	 		 	 
		}

}
