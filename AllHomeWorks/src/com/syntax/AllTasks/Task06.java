package com.syntax.AllTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		
		
		List <Integer> list = new ArrayList<>();
		
		Scanner  scan = new Scanner (System.in);
		
			 list.add(scan.nextInt());
			 list.add(scan.nextInt());
			 list.add(scan.nextInt());
			 list.add(scan.nextInt());
			 list.add(scan.nextInt());
			
			 
			 
			for (Integer integer : list) {
				
				System.out.print(integer+" ");
				
			} 
			 
			
		
	}

}
