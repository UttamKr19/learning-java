package com.xoriant.springboard.assignment.exceptionhandling;

public class NegativeAmountException extends Exception {
	public NegativeAmountException(String msg) {
		System.out.println(msg);
	}
}
