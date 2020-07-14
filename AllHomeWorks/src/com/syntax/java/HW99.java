package com.syntax.java;

import java.util.Scanner;

public class HW99 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    
	    for (int i=0; i<word.length();i+=3) {
	    	word.charAt(i);
	    	System.out.println(word.charAt(i));
	    }
		
		
	}

}
