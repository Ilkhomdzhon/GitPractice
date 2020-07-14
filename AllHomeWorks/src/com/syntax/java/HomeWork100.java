package com.syntax.java;

import java.util.Scanner;

public class HomeWork100 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Seperate:");
		String word=scan.nextLine();
		
		for (int i=0;i<word.length();i++) {
			char seperate=word.charAt(i);
			System.out.println(seperate);
		}
		
	}
	
	

}
