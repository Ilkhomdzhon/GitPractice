package com.syntax.SomeExamples;

public class Virginia {

	public void live() {
		System.out.println("People live in Virginia");
	}

	public void work() {
		System.out.println("People work in Virginia ");
	}

}

class Fairfax extends Virginia {

	
	public void live() {
		System.out.println("People live very safe in Fairfax");
	}

	
	public void work() {
		System.out.println("People get paid in Fairfax very well");
	}

	public void accessingParentClassmethod() {
		super.live();
		super.work();
		 
	}
}

class Alexandria extends Virginia {

	
	public void live() {
		System.out.println("People live rich in Alexandria");
	}

	
	public void work() {

		System.out.println("People work in Federal Companies in Alexandria");
	}

}
class Arlington extends Virginia{
	
	
	public void live () {
		System.out.println("People in Arlington work in Washington DC");
	}
	
	
}
