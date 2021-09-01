import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserData {
	public static void main(String[] args) {
		
		User users[]=new User[4];
		
		users[0]=new User("admin0","admin0");
		users[1]=new User("admin1","admin1");
		users[2]=new User("admin2","admin2");
		users[3]=new User("admin3","admin3");
		
		
		ObjectOutputStream stream=null;
		try {
			stream= new ObjectOutputStream(new FileOutputStream("users_data"));
			
			stream.writeObject(users);
			System.out.println("users object written in file");
			
		} catch (IOException e) {
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
	}
}
