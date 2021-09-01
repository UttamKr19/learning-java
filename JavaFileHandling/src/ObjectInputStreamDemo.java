import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		ObjectInputStream stream = null;
		try {
			stream = new ObjectInputStream(new FileInputStream("objectIO"));

			String str=(String)stream.readObject();
			System.out.println(str);

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
	}
}
