
public class StaticDemo {
	int var1;
	static int var2;
	
	public void method1() {
		System.out.println("THis is instance method");
		var1=99;
		var2=88;
		System.out.println("  "+var1+" "+var2);
	}
	
	public static void method2() {
		System.out.println("this is static method");
		StaticDemo staticDemo=new StaticDemo();
		staticDemo.var1=44;
		var2=55;
		System.out.println("  "+staticDemo.var1+" "+var2);
		staticDemo.method1();
	}
}
