package com.java.practise01;

public class StringManipulation1 {

	public static void main(String[] args) {

		/* Write JP print first 10 numbers of Fibanacci series
		 * 0 1 1 2 3 5 8 
		 * 
		 */
		
		int a,b,c ;
	     a=0 ;
		 b=1 ;
		
		 for (int i=1; i<10; i++);{
			
			 System.out.print(a+" ");
			 
			  c=a+b;
			  a=b;
			  b=c;
			
		 }
	}

}
