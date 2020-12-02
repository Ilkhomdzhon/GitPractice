package com.syntax.java1;

public class HomeWork014 {

	public static void main(String[] args) {
		
		/*
		 * For you to do
Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
Print the following statement:
_______ modded by _______ is ______
result2           result1    blank3
where blank3 is the remainder of result1 into result2
		 */
		
		int num1 = 5 ;
		int num2 = 4 ;
		int num3 = 7 ;
		int num4 = 2 ;
		int num5 = 4 ;
		int num6 = 6 ;
		
		int result = num1+num2;
		int result1 =result-num3;
		int mul = num4*num5;
		int result2 =num6/result;
		
		int blank2 = result2%result1;
		
		
		System.out.println(result2+"modded by"+result1+"is"+blank2);
		

	}

}
