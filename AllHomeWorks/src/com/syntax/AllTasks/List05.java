package com.syntax.AllTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List05 {

	public static void main(String[] args) {

			List <Integer> list =new ArrayList<>();
			System.out.println("Add any positive number");
			
				 Scanner scan = new Scanner(System.in);
				 int n ;
				 while ((n=scan.nextInt())>0) {
					list.add(n);
					
					 System.out.println(list);
					 
				 }
		
		
	}
}

