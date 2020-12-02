package com.syntax.Inheritance;

public class Bank {

	double money;
	double fee;

	public Bank(double money) {
		this.money = money;

	}

	public double chargeFee() {

		if (money < 1000) {

			fee = money * 0.4;
		} else {
			fee = 0;

		}

		return fee;

	}

}

class BoA extends Bank {

	public BoA(double money) {
		super(money);

	}

}

class WellsFargo extends Bank {

	public WellsFargo(double money) {
		super(money);

	}

	@Override
	public double chargeFee() {

		if (money < 1000) {
			fee = money * 0.45;

		} else {
			fee = money + money * 0.5;

		}

		return fee;

	}

}
