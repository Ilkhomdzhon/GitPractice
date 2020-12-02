package com.syntax.Interface;

public interface FirstInterface {
	/*
	 ** Follow Steps Carefully Step 2: Create another interface as SecondInterface in
	 * which create a method as secondMethod (Without Parameter)
	 * 
	 * Step 3: Inherit both interfaces to Main class. Step 4: Execute both methods
	 * 
	 * Expected Output: First Method implementing multiple Inheritance Second Method
	 * implementing multiple Inheritance
	 */

	public void firstMethod();

}

interface SecondInterface extends FirstInterface {

	public void secondMethod();

}
