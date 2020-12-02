package com.syntax.Inheritance;

public class Ilhom {

	String workPlace;
	String study;
	String delivery;

	public Ilhom(String workPlace, String study, String delivery) {

		this.workPlace = workPlace;
		this.study = study;
		this.delivery = delivery;

	}

	public void ilhomInfo() {
		System.out.println("I work at " + workPlace + " I'm studying " + study + " I used to deliver in " + delivery);
	}
}

class Mahmud extends Ilhom {

	String schoolName;

	public Mahmud(String schoolName, String workPlace, String study, String delivery) {
		super(workPlace, study, delivery);
		this.schoolName = schoolName;

	}

	public void mahmudInfo() {

		System.out.println("I study in "+schoolName+" it's not time to work "+workPlace+" and nor delivery for "+delivery);
	}

}

class Ibrohim extends Mahmud {

	public Ibrohim(String studyOnly, String workPlace, String study, String delivery) {
		super(studyOnly, workPlace, study, delivery);

	}
	
	public void ibrohimInfo() {

		System.out.println("I study in "+schoolName+" it's not time to work ");
	}

	

}