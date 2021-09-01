package com.xoriant.springboard.assignment.exceptionhandling;

public class BankMain {
	public static void main(String[] args) {
		try {
		BankAccount bank=new BankAccount("Uttam", "Saving", 6000);
		System.out.println(bank.getBalance());
		bank.deposit(10);
		System.out.println(bank.getBalance());
		bank.withdraw(10111);
		System.out.println(bank.getBalance());
		
		}catch (LowBalanceException | NegativeAmountException | InsufficientFundsException e) {
			e.printStackTrace();
		}
		
	}
}
