package com.syntax.BigRecap;

public abstract class Card {

	String creditCardType;

	int score;

	public Card(String creditCardType, int score) {
		this.creditCardType = creditCardType;
		this.score = score;

	}

	public abstract void apply();

	public void improveScore() {
		System.out.println(" If your score above " + score + " you will be eligible");

	}

}

class Visa extends Card {

	public Visa(String creditCardType, int score) {

		super(creditCardType, score);

	}

	public void apply() {
		System.out.println("If your score is in good shape than apply ");
	}

	@Override
	public void improveScore() {
		System.out.println("Make on time payment your " + score + " will be high");
	}

}

class Master extends Card {

	public Master(String creditCardType, int score) {
		super(creditCardType, score);

	}

	@Override
	public void apply() {
		System.out.println("Even if your " + score + " is good apply for it ");

	}

	@Override
	public void improveScore() {
		System.out.println("Even if you make ontime payment your score goes up ");
	}

}

class Amex extends Card {

	public Amex(String creditCardType, int score) {
		super(creditCardType, score);
	}

	@Override
	public void apply() {
		System.out.println("If your " + score + " is under 780 your will be rejected");

	}

	@Override
	public void improveScore() {
		System.out.println("You should have at least 2 years payment history to improve your score ");
	}

}
