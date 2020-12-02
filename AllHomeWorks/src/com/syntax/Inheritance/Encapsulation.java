package com.syntax.Inheritance;

public class Encapsulation {

	private String name;
	private int age;
	private int ssn;

	public String getName() {
		return name;

	}

	public void setName(String name) {
		
		if (!name.isEmpty() && name.length()>2 ) {
		this.name = name;
		}
	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		if (age >=18) {
		this.age = age;
		}else {
			System.out.println("Under ages cannot set any information");
		}
	}

	public int getSsn() {
		return ssn;

	}

	public void setSsn(int ssn) {
		this.ssn = ssn;

	}

}
