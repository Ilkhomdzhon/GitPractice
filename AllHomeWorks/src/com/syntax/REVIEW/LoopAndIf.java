package com.syntax.REVIEW;

public class LoopAndIf {

	public static void main(String[] args) {
		
		/*
		 * Print numbers 1 - 50 but don't print 
		 * number  45, 46, 47 ,49 .
		 */
		
			 for (int i =1 ; i<=50; i++) {
				 
				 if (i==45 || i==46 || i==47 || i==49) {
					 continue ;
					 
					 
				 }
				 System.out.println(i);
			 }
		
		
		
	}

}
