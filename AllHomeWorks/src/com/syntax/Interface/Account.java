package com.syntax.Interface;

public class Account { /*
						 * 
						 * Create the getter/setter methods for each variable.
						 * 
						 * In Main Class and the main method. Using setter methods assign the values as:
						 * acc_no = 7560504000 name = Sumair email = sumair@syntax.com amount = 50000.0
						 * Using getter methods print the values as below output. Expected Output:
						 * 7560504000 Sumair sumair@syntax.com 50000.0
						 * 
						 */

	private long acc_no;
	private String name;
	private String email;
	private double amount;

	
	public void setAccount(long acc_no) {
		this.acc_no = acc_no;

	}

	public long getAccount() {
		return acc_no;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getEmail() {
		return email;
	}

	public void setAmount(double amount) {
		this.amount = amount;

	}

	public double getAmount() {
		return amount;

	}

}
