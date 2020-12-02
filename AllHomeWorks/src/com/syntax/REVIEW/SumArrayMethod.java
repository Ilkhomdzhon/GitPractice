package com.syntax.REVIEW;

public class SumArrayMethod {

	int sumOfArray(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

		}

		return sum;

	}

	public static void main(String[] args) {

		SumArrayMethod obj = new SumArrayMethod();

		int[] arr = { 23, 34, 45, 23, 12, 122, 333 };

		int a = obj.sumOfArray(arr);

		System.out.println(a);

	}

}
