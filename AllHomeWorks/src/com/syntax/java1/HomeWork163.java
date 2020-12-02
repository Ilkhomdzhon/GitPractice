package com.syntax.java1;

public class HomeWork163 {

	public int biggestOfAll(int[][] array) {

		int largest = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] > largest) {
					largest = array[i][j];

				}
			}

		}

		return largest;

	}

	public static void main(String[] args) {

		HomeWork163 obj = new HomeWork163();

		int[][] b = { { 123, 343, 343994, 3432 }, { 1288831, 2323, 3434, 4444, } };

		int j = obj.biggestOfAll(b);

		System.out.println(j);

	}
}
