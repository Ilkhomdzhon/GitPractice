package com.java.practise01;

import java.util.Scanner;

public class ViceVersa {

	public static void main(String[] args) {
		
	          String name ;
	          String reverse="";
 	          Scanner scan= new Scanner (System.in);
 	          System.out.println("Give me name I will give reverse:");
 	          name=scan.nextLine();
 	
 	          
 	      for (int i=name.length()-1;i>-1;i--) {
 	    	   
 	    	 reverse=reverse+name.charAt(i);
 	    
 	    	 System.out.println("Reverse name is:");
 	    	 
 	    	 System.out.println(reverse);
 	    	  
 	       }
			
		        
	}

}
