import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		Console fromUser=System.console();
		System.out.println("Enter name:");
		String name=fromUser.readLine();
		System.out.println("Hello "+name);
	}
}
