package com.syntax.java1;

public class HomeWork117 {
	
	
/*
 * For you to do:
declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them

Expected Output:
10
10.23
a
100
100.23
s
 */
	
		 int number ;
		 double doble;
		 char letter;
		 
		 public static void main(String[] args) {
			
			 HomeWork117 a = new HomeWork117();
			 
			 	 a.number=10;
			 	 a.doble=10.23;
			 	 a.letter='a';
			 	 
			 	 System.out.println(a.number);
			 	 System.out.println(a.doble);
			 	 System.out.println(a.letter);
			 	 
			 	HomeWork117 b = new HomeWork117();
			 	
			 	b.number=100;
			 	b.doble=100.23;
			 	char c=b.letter='*';
			 	
			 	 System.out.println(b.doble);
			 	 System.out.println(b.number);
			 	 System.out.println(c);
			 	 
			 
			 
			 
		}
		 

}
