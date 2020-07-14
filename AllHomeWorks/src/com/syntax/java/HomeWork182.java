package com.syntax.java;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork182 {

	public static void main(String[] args) {
		
//		Using Scanner class add 5 elements into ArrayList and then print 
	//	all elements from that ArrayList all in 1 line
//
//		Numbers in:
//		4
//		62
//		8
//		5
//		4
//
//		Expected Output:
//		4 62 8 5 4 
          
		ArrayList<Integer>al=new ArrayList<>();
		
		 Scanner scan=new Scanner(System.in);
		 
		 al.add(scan.nextInt());
		 al.add(scan.nextInt());
		 al.add(scan.nextInt());
		 al.add(scan.nextInt());
		 al.add(scan.nextInt());
		 
		
		 for (Integer ab:al) {
			 
			 System.out.print(ab+" ");
			 
		 }
		
		
		 
		 
		
	}

}
