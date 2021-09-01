package com.xoriant.assignment.uttam;

public class Advisor {
	private String[] message;
	
	public Advisor() {
		message=new String[5];
		message[0]="Life is a box of chocolates!";
		message[1]="Never give up";
		message[2]="Hardwork beats talent";
		message[3]="Stay Foolish, Stay Hungry";
		message[4]="Today is a gift";
	}
	
	public String getAdvice() {
		int r=(int)(Math.random()*5);
		return message[r];
	}
}
