package com.syntax.REVIEW;

import java.util.Scanner;

public class SwitchOperator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char operator;
		int num1;
		int num2;

		int result = 0;

		System.out.println("Please enter number 1 ");
		num1 = scan.nextInt();

		System.out.println("Please choose the operator + , - , * , /");
		operator = scan.next().charAt(0);

		System.out.println("Please enter number 2 ");
		num2 = scan.nextInt();

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;
			
			default :
				System.out.println("You entered wrong operator");

				
				if (result !=0) {
					System.out.println( "Your result is "+result);
					
				}
		}
		

	}

}
