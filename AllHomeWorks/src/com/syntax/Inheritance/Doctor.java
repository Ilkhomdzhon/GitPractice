package com.syntax.Inheritance;

public class Doctor {

	String name;
	int doctorID;
	int phone;

	public Doctor(String name, int doctorID, int phone) {

		this.name = name;
		this.doctorID = doctorID;
		this.phone = phone;

	}
}

class Dentist extends Doctor {

	String plier;

	public Dentist(String name, int doctorID, int phone, String plier) {
		super(name, doctorID, phone);
		this.plier = plier;

	}
	
	
	

	public void doctorInfo() {
		System.out.println(
				"My doctors name " + name + " his ID " + doctorID + " his phone is " + phone + " he has a  " + plier);
	}

}
