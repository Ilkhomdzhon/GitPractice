package com.syntax.Interface;

import java.util.ArrayList;

public class ListSum {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(123);
		list.add(34232);
		list.add(344);
		list.add(554);
		list.add(5664);

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {

			sum = sum + list.get(i);

		}
		System.out.println(sum);

	}

}
