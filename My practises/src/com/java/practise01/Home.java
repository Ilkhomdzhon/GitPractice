package com.java.practise01;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		String name ;
		
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Please enter your name: ");
	          name=scan.nextLine();
		String parent;
		switch (name) {
		case "Sule" :
			parent = "Ender ve Isil Zirekoglu";
			break;
		case "Said" :
			parent = "Ender ve Isil Zirekoglu";
			break;
		case "Meliksah":
			parent = "Ender ve Isil Zirekoglu";
			break;
		case "Makhmud":
			parent = "Ilham ve Melahat";
			break;
		case "Ibrohim":
			parent ="Ilham ve Melahat";
			break;
		case "Ahmet":
			parent ="Ilham ve Melahat";
			break ;
			
			default :
				parent= "Name is not in my list ";
				
				System.out.println("Your parents are : "+parent);
			
		}
			
	}
	
}
