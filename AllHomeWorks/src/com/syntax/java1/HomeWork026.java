package com.syntax.java1;

import java.util.Scanner;

public class HomeWork026 {

	public static void main(String[] args) {
		
		 /*
		  * For you to do: 
The variable "name" holds a String user input 
Write a conditional statement starting on line 9 that does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"

Examples:
In: Chen
teacher
In: Faa
student

Hint: for your if condition use if(name.equals("Chen")) - we haven't study it yet, but this is code to compare Strings. We will cover this topic soon. 

		  */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("In ");
		String name = scan.next();
		
		if (name.equalsIgnoreCase("Ilhom")) {
			System.out.println("Tester");
		}else {
			System.out.println("Student");
		}
		
		
	}

}
