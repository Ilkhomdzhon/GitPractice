package com.java.practise01;

import java.util.Scanner;

public class HW77 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    int [] x = new int[5];
	    for (int i=0;i<x.length;i++){
	      x[i]=sc.nextInt();
	    }
	    for(int i=x.length-1; i>=0;i--){
	      System.out.println(x[i]);
	      
	      
	    }
	   
	}

}
