package com.syntax.Inheritance;

public class Registration {

	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		return email;
	}

	public String getuserName() {
		return userName;

	}

	public String getpassWord() {
		return password;

	}

	public void setEmail(String email) {
		if (email.contains("gmail.com")) {

			this.email = email;

		} else {
			System.out.println("Email can be only gmail type");
		}
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() < 5) {
				if (password.contentEquals(userName)) {

					this.password = password;

				} else {
					System.out.println("Password cannot not contain Username");
				}

			} else {
				System.out.println("Password length cannot be less than 5 char.");
			}

		} else {
			System.out.println("Password cannot be empty");
		}
	}

	public void setuserName(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length() > 6) {
				this.userName = userName;

			} else {
				System.out.println("UserName character cannot be less than 6 ");
			}

		} else {
			System.out.println("UserName cannot be empty");
		}
	}

}
