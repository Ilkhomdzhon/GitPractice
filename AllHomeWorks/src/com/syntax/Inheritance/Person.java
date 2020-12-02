package com.syntax.Inheritance;

public class Person {

	String name, lastName;
	int age;

	public Person(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;

	}

}

class Employee1 extends Person {

	int salary;

	public Employee1(String name, String lastName, int age, int salary) {
		super(name, lastName, age);
		this.salary = salary;
		
	}
	
	public void empInfo() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}

}

class Student extends Employee1 {

	int grade;

	public Student(String name, String lastName, int age, int grade) {
		super(name, lastName, age, grade);
		this.grade = grade;

	}
	
	public void studentInfo() {
		System.out.println(name+" "+lastName+" "+age+" "+grade);
	}

}

class Retiree extends Employee1 {

	String seniorActivity;

	public Retiree(String name, String lastName, int age, String seniorActivity) {
		super(name, lastName, age, age);
		this.seniorActivity = seniorActivity;

	}
	
	public void retireeInfo() {
		System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	}

}
