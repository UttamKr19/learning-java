import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) {
		BufferedReader fromUser=null;
		
		fromUser=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter name:");
			String name=fromUser.readLine();
			System.out.println("Hello "+name);
			
			System.out.println("Enter num1:");
			int num1=Integer.parseInt(fromUser.readLine().strip());
			System.out.println("Enter num2:");
			int num2=Integer.parseInt(fromUser.readLine().strip());
			
			System.out.println(num1+num2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
