package com.syntax.Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal cow = new Cow();
		cow.eat();
		cow.makeNoise();
		cow.milk();
		cow.hit();

		Animal sheep = new Sheep();
		 sheep.eat();
		 sheep.makeNoise();
		 sheep.milk();
		 sheep.hit();
	}

}
