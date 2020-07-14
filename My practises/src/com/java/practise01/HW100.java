package com.java.practise01;

import java.util.Scanner;

public class HW100 {

	public static void main(String[] args) {
		
//		Write a for loop that will print out each letter of the string s, 
//		separated by spaces, on the same line.
		String s= "";
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	     s = inp.nextLine();
		
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
		 	System.out.println(c+" ");

	}

}
}

