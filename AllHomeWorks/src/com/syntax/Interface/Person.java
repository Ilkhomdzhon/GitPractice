package com.syntax.Interface;

public class Person {

	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private String ssn;

	public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		this.ssn = ssn;
	}

	public String getFirstname() {
		return firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public int getBirthMonth() {
		return birthMonth;

	}

	public int getBirthDay() {
		return birthDay;
	}

	public int getBirthYear() {
		return	birthYear;

	}

	public String getSsn() {
		return ssn;

	}

	public String formatBirthday() {
		return this.birthMonth + "/" + this.birthDay + "/" + this.birthYear;

	}

}
