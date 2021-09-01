import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		ObjectOutputStream stream=null;
		try {
			stream= new ObjectOutputStream(new FileOutputStream("objectIO"));
			
			String aString="This is string object";
			stream.writeObject(aString);
			System.out.println("object written in file");
			
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
