package com.syntax.java1;

public class HomeWork103 {

	/*
	 * Create a Class Main
	 * 
	 * In this class, you should specify the following attributes: breed, name,
	 * color, and following behaviors: bark(), run(), play(). Create 3 different
	 * objects of it: Husky, Bulldog, Labrador with specific attributes and
	 * behaviors.
	 * 
	 * The output of the program should be as following:
	 * 
	 * Husky can bark Husky can run Husky can play Bulldog can bark Bulldog can run
	 * Bulldog can play Labrador can bark Labrador can run Labrador can play
	 */

	String name, breed, color;

	public void bark() {

		System.out.println(breed + " can bark");
	}

	public void run() {
		System.out.println(breed + " can run");

	}

	public void play() {
		System.out.println(breed + " can play");
	}
	
	public static void main(String[] args) {
		
		HomeWork103 dog1 = new HomeWork103();
		
		dog1.breed="Husky";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
	}
}
