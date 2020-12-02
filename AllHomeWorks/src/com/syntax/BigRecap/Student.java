package com.syntax.BigRecap;

public class Student {

	String name, address;

	Student(String name, String address) {
		this.name = name;
		this.address = address;

	}

	public void displayInfo(String name, String address) {

		System.out.println(name + " " + address);

	}

	public static void main(String[] args) {

		Student student = new Student("Ilhom", "2975 Huntersbranch Road");

		student.displayInfo("Ilhom", "2975 Huntersbranch Road");
	}

}
