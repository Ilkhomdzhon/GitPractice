package com.syntax.java1111;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW182 {

	public static void main(String[] args) {
		  
		
		 List<Integer> al=new ArrayList<>();
		 
		  Scanner scan=new Scanner(System.in);
		  
		  al.add(scan.nextInt());
		  al.add(scan.nextInt());
		  al.add(scan.nextInt());
		  al.add(scan.nextInt());
		  al.add(scan.nextInt());
		  
		  for (Integer integer : al) {
			  System.out.print(integer+",");
			
		}
		  
		 
		}
		  

		 
		
	}


