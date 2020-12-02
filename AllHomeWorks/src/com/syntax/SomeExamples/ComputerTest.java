package com.syntax.SomeExamples;

public class ComputerTest {

	public static void main(String[] args) {

		Computer apple = new Apple("MacBook", 10);

		Apple app = new Apple("Pro", 3);
		app.bestSeller();

		Computer lenova = new Lenova("Lenova", 1);

		Computer hp = new HP("HP model", 3);

		Computer dell = new Dell("Dell model", 4);

		Computer[] comps = { apple, lenova, hp, dell, };

		for (Computer computer : comps) {

			computer.work();
			computer.memorySize();
			
		}

		for (int i = 0; i < comps.length; i++) {
			comps[i].work();
			comps[i].memorySize();
		}

	}

}
