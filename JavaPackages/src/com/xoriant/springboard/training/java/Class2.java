package com.xoriant.springboard.training.java;

class Class2 {
	private int privateVarClass2;
	int defaultVarClass2;
	protected int protectedVarClass2;
	public int publicVarClass2;

	public Class2() {
		System.out.println("Constructor Class2");
	}
	
	private void privateMethodClass2() {
		System.out.println("Private method Class2");
	}

	void defaultMethodClass2() {
		System.out.println("Default method Class2");
	}

	protected void protectedMethodClass2() {
		System.out.println("Protected method Class2");
	}

	public void publicMethodClass2() {
		System.out.println("Public method Class2");
	}	
}
