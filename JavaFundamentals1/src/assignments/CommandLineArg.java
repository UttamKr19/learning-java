package assignments;

public class CommandLineArg {
	public static void main(String[] args) {
		System.out.println("main method");
		
		
		String fname=args[0];
		String lname=args[1];
		int age=Integer.parseInt(args[2]);
		
		System.out.println(fname+" "+lname+" "+age);
		
	}

}
