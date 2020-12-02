package com.syntax.REVIEW;

public class LArgest {
	 
	public static void main(String[] args) {
		
		int [] num = {200,400,444,900,930,500,50};
		
		int largest = num[0];
		int smallest = num[0];
			
		 for (int i=1;i<num.length;i++) {
			 
			 
			 if (num[i]>largest) {
				 largest=num[i];
				 
			 }
			
			 
		 }
		 System.out.println("Largest number is "+largest);
		
		
		
	}
	
	
	

}
