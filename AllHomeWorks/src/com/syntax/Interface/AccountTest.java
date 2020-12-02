package com.syntax.Interface;

public class AccountTest {

	public static void main(String[] args) {
		
		
		
		Account account = new Account();
		
		 account.setAccount(7560504000l);
		 account.setName("Sumair");
		 account.setEmail("Sumair@syntax.com");
		 account.setAmount(50000.0);
		 
		 System.out.println(account.getAccount()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount());
	}

}
