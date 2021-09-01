package com.xoriant.springboard.assignment.exceptionhandling;

public class BankAccount {

	private static int incrementer;
	private int accNo;
	private String custName;
	private String accType;
	private float balance;

	public BankAccount(String custName, String accType, float initialBalance)
			throws LowBalanceException, NegativeAmountException {

		if (initialBalance < 0) {
			throw new NegativeAmountException("Initial deposit cannot be negative");
		}
		if (accType == "Saving") {
			if (initialBalance < 5000) {
				throw new LowBalanceException("Minimum initial deposit for saving account is 5000");
			}
		}
		if (accType == "Current") {
			if (initialBalance < 1000) {
				throw new LowBalanceException("Minimum initial deposit for current account is 1000");
			}
		}
		
		this.accNo = incrementer++;
		this.custName = custName;
		this.accType = accType;
		this.balance=initialBalance;
		
	}

	public void deposit(float amt) throws NegativeAmountException {
		if (amt < 0) {
			throw new NegativeAmountException("Deposit amount cannot be negative");
		}
		this.balance = this.balance + amt;
	}

	public void withdraw(float amt) throws InsufficientFundsException, NegativeAmountException {
		if (amt < 0) {
			throw new NegativeAmountException("Withdrawal amount cannot be negative");
		}

		if (balance < amt) {
			throw new InsufficientFundsException("balance insufficent");
		}

		this.balance = this.balance - amt;
	}

	public float getBalance() throws LowBalanceException {

		if (accType == "Current") {
			if (balance < 1000) {
				throw new LowBalanceException("account balance "+balance+" low, must be at least 1000");
			}
		} else if (accType == "Saving") {
			if (balance < 5000) {
				throw new LowBalanceException("account balance "+balance+" low, must be at least 5000");
			}
		}
		return this.balance;
	}

}
