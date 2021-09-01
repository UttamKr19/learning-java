
public class StaticTest {
	public static void main(String[] args) {

		//access instance data member- use instance of class
		StaticDemo demo=new StaticDemo();
		demo.var1=10;
		System.out.println(demo.var1);
		
		//instance method call using instance of class
		demo.method1();
		
		
		//access static data member- use classname
		StaticDemo.var2=20;
		System.out.println(StaticDemo.var2);
		
		//static method call using name of the class
		StaticDemo.method2();
		
	}
}
