package com.syntax.REVIEW;

class SomeExample {

	public int getLargest(int[] array) {

		int largest = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > largest) {
				largest = array[i];

			}
		}

		return largest;

	}
	
		 public static void main(String[] args) {
			 
			 SomeExample ex = new SomeExample();
			 
			 int[] arra = {12,323,43,455,2231,1222,};
			 
			int a = ex.getLargest(arra);
			
				 System.out.println(a);
			 
			 	 
			
		}

}
