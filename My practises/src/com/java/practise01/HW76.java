package com.java.practise01;
import java.util.*;
public class HW76 {

	public static void main(String[] args) {

		  
		Scanner sc=new Scanner(System.in);
		String[] day=new String[7];
		String userInput;
		for (int i=0;i<=day.length-1;i++) {
			System.out.println("Please enter day "+(i+1)+" of the week");
			userInput=sc.nextLine();
			day[i]=userInput;
		}
		for (String x:day) {
		System.out.println(x);
		}
	}
}

	


