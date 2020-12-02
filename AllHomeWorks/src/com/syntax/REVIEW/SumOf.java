package com.syntax.REVIEW;

public class SumOf {
	
	
	public static void main(String[] args) {
		
		int sumOfeven= 0;
		int sumOfodd= 0;
		
		
		for (int i =1 ; i<=99; i++) {
			
			if (i%2==0) {
				sumOfeven=sumOfeven+i;
				
			}else {
				sumOfodd=sumOfodd+i;
				
			}
			
			
		}
		System.out.println("Sum of even "+sumOfeven);
		System.out.println("Sum of odd "+sumOfodd);
		
		
	}

}
