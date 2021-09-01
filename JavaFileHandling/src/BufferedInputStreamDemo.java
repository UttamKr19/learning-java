import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		BufferedInputStream stream = null;

		try {
			stream = new BufferedInputStream(new FileInputStream("bufferIO"));
			while(stream.available()>0)
				System.out.print((char)stream.read());
			
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
