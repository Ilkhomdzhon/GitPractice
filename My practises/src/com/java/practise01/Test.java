package com.java.practise01;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		          String name; 
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter name of the instructor");
				      name=scan.nextLine();
				    String task;
				
				    switch(name) {
				    
				    case  "Shiva":
				    	task="Will take care of Java Assignment";
				    	break;
				    case "Sandish":
				    	task="Will take care of SDLC Assignment";
				    	break;
				    case "Weqas":
				    	task="Will take care of Selenium Assignment";
				    	break;
				    case "Asel":
				    	task="Will take care of every Assignment";
				    	break;
				    	
				    	default:
				    		task="Invalid instructor selected";
				    		
				    	
				    }
				    System.out.println(task);
				    
				
				
				
				
		  }
			}



		  



		
		
		
		
		
		
		
	
