package com.syntax.java;

public class HomeWork113 {

	
//		Create a method with the following specs:  
//
//			Returns:
//			an integer
//			Name:
//			sumEvenToX
//			Parameters:
//			an integer called "x"
//			Purpose:
//			calculate the sum of the EVEN integers from 1 to x (including x)
//
//			Examples:
//			sumEvenToX(5) ==> 6
//			sumEvenToX(8) ==> 20
		
		int sumEvenToX( int x) {
	    int sum=0;
	    for (int i=0;i<=x;i++) {
	    	if (i%2==0) {
	    		sum=sum+i;
	    		
	    	}
	    	
	    }
		return sum;
		
		
		}
		public static void main(String[] args) {
			
			HomeWork113 obj=new HomeWork113();
		
			int a=obj.sumEvenToX(5);
			int b=obj.sumEvenToX(8);
			
			System.out.println(a);
			System.out.println(b);
		}
		
		
		
	}


