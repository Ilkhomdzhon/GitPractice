package com.syntax.Interface;

public class FEDTest {

	public static void main(String[] args) {

		
		System.out.println("========BANK OF AMERICA========");
		
		BOA boa = new BOA();
		boa.mortgage();
		boa.giveCredit();
		boa.financeCar();

		
		System.out.println("========FED========");
		
		FED fed = new WhiteHouse();
		fed.print();
		fed.save();
		
		System.out.println("========WHITE HOUSE========");	 
		WhiteHouse wh= new WhiteHouse();
		wh.controlEco();
		wh.regulate();
		wh.save();
		wh.print();

	}

}
