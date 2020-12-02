package com.syntax.REVIEW;

public class ArraySum {
	
	
	 public static void main(String[] args) {
		
		 int[] num = {3,5,33,11,44,55,55,66,222} ;
		  int sum =0;
		  
		  for (int i : num) {
			  sum+=i;
			 
			  
		}
		  System.out.println("-->"+sum);
		  
			
		 
		  
		  int a =0;
		  
		  for (int i=0; i<num.length;i++) {
			  a=a+num[i];
			  
			  
		  }
		  System.out.println("-->"+a);
				 
			 
		 }
	 
		 
		 
	}


