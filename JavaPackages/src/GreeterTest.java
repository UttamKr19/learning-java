import java.util.Scanner;

import com.xoriant.assignment.uttam.*;

public class GreeterTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] names=input.split(" ");
		
		
		Greeter greeter;
		Advisor advisor=new Advisor();;

		for (String name : names) {
			greeter=new Greeter(name);
			System.out.println(greeter.sayHello());
			
			System.out.println(advisor.getAdvice());
			
			System.out.println(greeter.sayGoodBye());
		}
				
		
	}
}
