package com.syntax.REVIEW;

public class ExampleClock {
	 
		 public static void main(String[] args) {
			
			 for (int h=0 ; h<=24; h++) {
				 for (int m=0; m<=59;m++) {
					 
					 
					 if (m<10) {
						 System.out.println(h+":0"+m);
					 }else {
						 System.out.println(h+":"+m);
					 }
					 
					 System.out.println(h+":"+m);
				 }
			 }
			 
		}
	
	
	
}
