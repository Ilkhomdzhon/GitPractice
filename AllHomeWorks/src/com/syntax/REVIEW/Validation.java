package com.syntax.REVIEW;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String username;
		String password;
		String confirmedPassword;

		String message;

		System.out.println("Please enter your username");
		username = scan.next();

		System.out.println("Please Enter your password");
		password = scan.next();

		System.out.println("Please confirm the password");
		confirmedPassword = scan.next();

		if ((!username.isEmpty() || password.isEmpty())) {

			if (password.length() < 8) {

				if (!password.contains(username)) {

					System.out.println("Please confirm password");
					confirmedPassword = scan.nextLine();

					if (password.contentEquals(confirmedPassword)) {
						System.out.println("Your account created successfully");

					} else {
						System.out.println("Password didn't match");
					}

				} else {
					System.out.println("Password cannot contain username ");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			System.out.println("Username and Password can not be empty");
		}

	}
}
