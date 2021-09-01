package com.xoriant.springboard.training.java;
import static com.xoriant.springboard.training.java.Class1.*;

public class PackageTest {

	public static void main(String[] args) {
		Class1 class1=new Class1();
		class1.defaultVarClass1=10;
		class1.protectedVarClass1=20;
		class1.publicVarClass1=30;
		//class1.privateVarClass1=0; //not accessible
		class1.defaultMethodClass1();
		class1.protectedMethodClass1();
		class1.publicMethodClass1();
		//class1.privateMethodClass1(); //not accessible
//		Class1.staticVarClass1=100;
//		Class1.staticMethodClass1();
		staticVarClass1=200;
		staticMethodClass1();
		
		
		
		Class2 class2=new Class2();
		class2.defaultVarClass2=40;
		class2.protectedVarClass2=50;
		class2.publicVarClass2=60;
		//class2.privateVarClass2=0; //not accessible
		class2.defaultMethodClass2();
		class2.protectedMethodClass2();
		class2.publicMethodClass2();
		//class2.privateMethodClass2(); //not accessible
		
	}

}
