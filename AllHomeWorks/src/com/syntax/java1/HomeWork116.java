package com.syntax.java1;

public class HomeWork116 {

	int getLargest(int[] array) {

		int largest = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > largest) {
				largest = array[i];

			}
		}
		return largest;

	}
		 public static void main(String[] args) {
			
			 HomeWork116 obj = new HomeWork116();
			 	
			  	 int [] bbb= {45,34,45,555,666,663,};
			  	 	 
			  	 	 	 System.out.println(obj.getLargest(bbb));
		}

}