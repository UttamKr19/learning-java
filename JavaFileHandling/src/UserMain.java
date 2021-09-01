import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserMain {

	static boolean validateUser(String username, String password) {

		ObjectInputStream stream = null;
		try {
			stream = new ObjectInputStream(new FileInputStream("users_data"));

			User[] users = (User[]) stream.readObject();
			for (User user : users) {
				if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
					return true;
				}
			}

			return false;

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		String username = "admin0";
		String password = "admin0";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		username = sc.next();
		System.out.println("Enter password");
		password = sc.next();

		boolean isValidUser = validateUser(username, password);

		if (isValidUser) {
			System.out.println("User validated: Login Successful!");

		} else {
			System.out.println("User validation failed: Try again");
		}

//		
	}
}
