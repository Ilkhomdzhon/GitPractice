package com.syntax.REVIEW;

public class Array {
	
	
		 int large (int [] array) {
			 
			 int  largest =array[0];
			 	
			 for (int i=1;i<array.length;i++) {
				 
				 	 if (array[i]>largest) {
				 		 largest =array[i];
				 		 
				 	 }
			 }
			return largest;
			 
			 	 	 
		 }
		 
		 	 public static void main(String[] args) {
				
		
		 Array obj = new Array();
		 
		 	 int [] a = {56,7,888,777,444,666,54555};
		 	 
		 	 	 int ss=obj.large(a);
		 	 	 System.out.println(ss);
		 	 	 
	
}
}