package com.xoriant.springboard.assignment.exceptionhandling;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String msg) {
		System.out.println(msg);
	}
}
