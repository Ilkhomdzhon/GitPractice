package com.syntax.java1;

public abstract class Tea {
	/*
	 * Abstracti In main class create an object of 2 Child and assign them to Parent
	 * reference type. Execute method addSugar from both classes.
	 * 
	 * Expected Output: 
	 * For Lemon Tea we need 2 spoons of sugar 
	 * For Chai Tea we need 1 spoon of sugar
	 */

	String teaType;

	public Tea(String teaType) {
		this.teaType = teaType;

	}

	public abstract void addSugar();
}

class LemonTea extends Tea {

	public LemonTea(String teaType) {
		super(teaType);

	}

	public void addSugar() {
		System.out.println("For " + teaType + " we need 2 spoons of sugar");

	}

}

class ChaiTea extends Tea {

	public ChaiTea(String teaType) {
		super(teaType);

	}

	public void addSugar() {
		System.out.println("For " + teaType + " we need 1 spoon of sugar");
	}

}
