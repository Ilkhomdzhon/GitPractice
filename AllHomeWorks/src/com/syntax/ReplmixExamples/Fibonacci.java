package com.syntax.ReplmixExamples;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		int a, b, c;

		a = 0;
		b = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(a + " ");
			a = a + b;
			a = b;
		//	b = c;
		}

	}

}
