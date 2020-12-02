package com.syntax.AllTasks;

import java.util.LinkedHashSet;
import java.util.Set;

class Student {

	int studentId;
	String name, lastName;

	public Student(int studentId, String name, String lastName) {
		this.studentId = studentId;
		this.name = name;
		this.lastName = lastName;

	}
	
	public void display() {
		System.out.println("Student details :"+name+" "+lastName+" "+" and id "+studentId);
	}

}

public class Task14 {

	public static void main(String[] args) {
		
		Set<Student> studentInfo= new LinkedHashSet<>();
		
		studentInfo.add(new Student(101,"Sumair","Jawaid"));
		studentInfo.add(new Student(102,"Asel","Umurzakova"));
		studentInfo.add(new Student(103,"Diego","Juarez"));
		studentInfo.add(new Student(104,"Sohil","Aryan"));
		studentInfo.add(new Student(105,"Alijon","Nazarov"));
		
			 for (Student stu:studentInfo) {
				 stu.display();
			 }

	}

}
