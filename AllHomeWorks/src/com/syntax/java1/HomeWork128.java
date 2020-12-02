package com.syntax.java1;

public class HomeWork128 {

	/*
	 * Write a method with the following specs:
	 * 
	 * Returns: an integer Name: countVowels Parameters: a String called s Purpose:
	 * count the number of vowels in the string s. Assume s is all lowercase.
	 * 
	 * Examples: countVowels("obama") ==> 3
	 * countVowels("happy friday! i love weekends") ==> 9
	 */

	public static int countVowels(String s) {

		int vowel = 0;

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < vowels.length; j++) {

				if (s.charAt(i) == vowels[j]) {
					vowel++;

				}
			}

		}

		return vowel;

	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(countVowels("obama")); // 3
		System.out.println(countVowels("happy friday! i love weekends")); // 9

	}
}
