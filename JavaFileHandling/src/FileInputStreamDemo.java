import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {

		try (FileInputStream stream = new FileInputStream("fileIO")) {
			int data;
			while ((data = stream.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
