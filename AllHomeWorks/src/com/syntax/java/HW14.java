package com.syntax.java;

public class HW14 {

	public static void main(String[] args) {
		
//		For you to do
//			Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
//			Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
//			Print the following statement:
//			_______ modded by _______ is ______
//			result2           result1    blank3
//			where blank3 is the remainder of result1 into result2
		
       int num1 =20 ;
       int num2=10;
       int num3=15;
       int num4=5;
       int num5=14;
       int num6=6;
       
       
       
       int add =num1+num2;
       int result1=add-num3;
       int result2=num4*num5;
       int result3=result2/num6;
       
       
       System.out.println(result2%2+" modded by "+result1+" is "+result3);
		
		
		
	}

}
