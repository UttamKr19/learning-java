
public class Main2 {
	public static void main(String[] args) {
		Interface1 interface1;
		Interface2 interface2;
		
		interface1=new MyClass();
		interface1.m1();
		interface1.m2();
		
		interface2=new MyClass();
		interface2.m3();
		interface2.m4();
		
		interface1.m5();
		interface2.m5();
	}
}
