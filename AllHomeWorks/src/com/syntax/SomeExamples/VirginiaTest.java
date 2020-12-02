package com.syntax.SomeExamples;

public class VirginiaTest {

	public static void main(String[] args) {

		Virginia va = new Fairfax();
		
		 va.live();
		 va.work();
		
		 
		Fairfax fair= new Fairfax();
		fair.accessingParentClassmethod();
		System.out.println("==================================");
		fair.live();
		fair.work();
		 

	}
}
