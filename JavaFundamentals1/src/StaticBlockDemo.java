
public class StaticBlockDemo {
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}
	
	{
		System.out.println("init block");
	}
	
	public StaticBlockDemo() {
		System.out.println("Contructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		new StaticBlockDemo();
		new StaticBlockDemo();
	}
}
