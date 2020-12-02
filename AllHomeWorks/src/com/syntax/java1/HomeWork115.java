package com.syntax.java1;

public class HomeWork115 {
	
/*
 * Write a method header with the following specs:    

Returns:
a String
Name:
censorLetter
Parameters:
a String
a char

Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.

Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"

 */
		public  String censorLetter(String c , char b) {
			
			 String a = Character.toString(b);
			 c=c.replaceAll(c, "*");
			 
			return c ;
			
		}
	
			 public static void main(String[] args) {
				
				 HomeWork115 met = new HomeWork115();
				 	
				   String as =met.censorLetter("Computer science", 'e');
				   System.out.println(as);
				 
			}

}
