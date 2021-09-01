package com.xoriant.springboard.assignment.exceptionhandling;

public class LowBalanceException extends Exception {
	public LowBalanceException(String msg) {
		System.out.println(msg);
	}
}
