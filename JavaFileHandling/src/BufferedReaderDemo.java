import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("bufferIO_3"));
			String l;
			while ((l = reader.readLine()) != null) {
				System.out.println(l);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
