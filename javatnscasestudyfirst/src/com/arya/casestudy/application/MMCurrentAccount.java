package com.arya.casestudy.application;

import com.arya.casestudy.framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount {
	public MMCurrentAccount(int accountNumber, String accountName, float accountBalance ,float creditLimit) {
		
		 
			super(accountNumber, accountName, accountBalance, creditLimit);
			// TODO Auto-generated constructor stub
		
		
		
	}
	@Override 
	public void withdraw(float ammount) {
		float creditLimit = getCREDIT_LIMIT();
		float oldAccountBalance = getAccountBalance();
		float newAccountBalance=0;
		if(ammount < (oldAccountBalance+creditLimit)) {
			newAccountBalance = oldAccountBalance-ammount;
			setAccountBalance(newAccountBalance);
		}else
			System.out.println("Insuffiecient fund.");
		
		System.out.println("Balance:" + (newAccountBalance+creditLimit));
		System.out.println("Credit Limit:" + creditLimit);
	}
	
	
	@Override
	public void deposit(float amount) {
		float oldAccountBalance = getAccountBalance();
		float newAccountBalace = oldAccountBalance+amount;
		setAccountBalance(newAccountBalace);
		
		System.out.println("Balance:" + newAccountBalace);
	}

	

}
