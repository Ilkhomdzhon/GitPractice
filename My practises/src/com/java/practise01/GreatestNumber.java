package com.java.practise01;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
//	 Take three numbers from the user and print the greatest number. 
//	      
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87
         int num1;
          int num2; 
          int num3 ;
          int num;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter number 1");
		     num1=scan.nextInt();
		 System.out.println("Enter number 2 ");
		      num2=scan.nextInt();
		 System.out.println("Enter number 3 ");
               num3=scan.nextInt();

               if (num1>num2 && num1>num3) {
            	   System.out.println("Greatest number is "+num1);
            	   
               }else if (num2>num1 && num2>num3) {
            	   System.out.println("Greatest number is "+num2);
            	   
            	              
               }else if (num3>num1 && num3>num2) {
            	   System.out.println("Greatest number is "+num3);
               }
	}

}
