package com.syntax.REVIEW;

public class HelloWorld {

	String reverseMethod(String a) {

		String reverse = " ";

		for (int i = a.length() - 1; i>=0; i--) {

			reverse = reverse + a.charAt(i);

		}

		return reverse;

	}
		 public static void main(String[] args) {
			
			 HelloWorld rv=new HelloWorld();
			 	 
			 	 String a = rv.reverseMethod("Ilhom");
			 	 System.out.println(a);
			 	 
		}

}
