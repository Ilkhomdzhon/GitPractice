package com.syntax.Inheritance;

public abstract class Animal {

	public void eat() {
		System.out.println("Animal eats too much ");

	}

	public void makeNoise() {
		System.out.println("Animal makes noise ");

	}

	public abstract void milk();

	public abstract void hit();

}

class Cow extends Animal {

	@Override
	public void milk() {
		System.out.println("Cows gives milk");

	}

	@Override
	public void hit() {
		System.out.println("Cow can hit you with leg");

	}

}

class Sheep extends Animal {

	@Override
	public void milk() {
		System.out.println("Sheeps can give milk to sheepy");

	}

	@Override
	public void hit() {
		System.out.println("Sheeps hit with it's head very bad ");

	}

}