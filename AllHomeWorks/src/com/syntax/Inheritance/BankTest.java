package com.syntax.Inheritance;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new Bank(700);
		double fee = bank.chargeFee();
		System.out.println(fee);

		
		WellsFargo  wellsfargo = new WellsFargo(700);
		fee=wellsfargo.chargeFee();
		System.out.println(fee);
		
		BoA boa= new BoA(320);
		fee=boa.chargeFee();
		System.out.println(fee);
		
		
	}

}
