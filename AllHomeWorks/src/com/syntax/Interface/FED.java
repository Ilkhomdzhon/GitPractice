package com.syntax.Interface;

public interface FED {

	String money = "Dollar";
	String dime = "Coins";

	public void print();

	public void save();

}

interface FinanceMinistry extends FED {

	public void regulate();

	public void controlEco();

}

interface FannaMia {

	public void mortgage();

}

interface CreditUnion {

	public void giveCredit();

	public void financeCar();

}

class BOA implements CreditUnion, FannaMia {

	@Override
	public void mortgage() {
		System.out.println("BOA gives people mortgage with low APR ");

	}

	@Override
	public void giveCredit() {
		System.out.println("BAnk of America gives people money");

	}

	@Override
	public void financeCar() {
		System.out.println("If you want to drive go BOA to make finance car");

	}

}

class WhiteHouse implements FinanceMinistry {

	@Override
	public void print() {
		System.out.println("White House decides how much to print " + money);

	}

	@Override
	public void save() {
		System.out.println("White House decides where to save " + money + " " + dime);

	}

	@Override
	public void regulate() {
		System.out.println("Also it takes regulation to control " + money + " " + dime);

	}

	@Override
	public void controlEco() {
		System.out.println("White House control Economic stability");

	}

}
