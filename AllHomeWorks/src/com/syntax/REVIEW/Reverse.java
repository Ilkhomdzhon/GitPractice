package com.syntax.REVIEW;

public class Reverse {
	
		 String reverseStr(String a) {
			 
			 String reverse = " " ;
			 
			 
			 for (int i=a.length()-1;i>=0;i--) {
				 reverse = reverse+a.charAt(i);
				 
			 }
			return reverse;
			 	 
		 }
		 	 public static void main(String[] args) {
				
		 		Reverse rev = new Reverse();
		 		
		 			 String a=rev.reverseStr("What");
		 			 System.out.println(a);
		 			 
		 		 
			}
	
	
}
