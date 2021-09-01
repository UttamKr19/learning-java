import com.xoriant.springboard.training.java.Class1;
//import com.xoriant.springboard.training.java.Class2;
import static com.xoriant.springboard.training.java.Class1.*;
import static java.lang.System.out;

public class PackageDemo {
	public static void main(String[] args) {
		Class1 class1=new Class1();
		//class1.defaultVarClass1=10; //not accessible
		//class1.protectedVarClass1=20; //not accessible
		class1.publicVarClass1=30;
		//class1.privateVarClass1=0; //not accessible
		//class1.defaultMethodClass1(); //not accessible
		//class1.protectedMethodClass1(); //not accessible
		class1.publicMethodClass1();
		//class1.privateMethodClass1(); //not accessible
		staticVarClass1=300;
		staticMethodClass1();
		
		out.println("print using static import");
		
		//Class2 class2=new Class2(); //not visible
		
		
	}
}
