package com.java.practise01;

public class Return {
	
	 int sum (int a ,int b, int c ) {
	     return a+b+c;
	 }
	 
	 public static void main(String[] args) {
		
		 Return obj=new Return();
	     obj.sum(10, 20,4000 );

		 
		 System.out.println(obj.sum(10, 20,4000));
		 
	}

}
