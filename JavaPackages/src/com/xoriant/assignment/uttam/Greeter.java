package com.xoriant.assignment.uttam;

public class Greeter {
	private String name;
	
	public Greeter(String name) {
		this.name=name;
	}
	
	public String sayHello() {
		return "Hello "+name;
	}
	
	public String sayGoodBye() {
		return "Goodbye "+name;
	}
	
}
