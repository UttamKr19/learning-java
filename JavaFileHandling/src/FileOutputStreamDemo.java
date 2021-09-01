import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream stream = null;
		
		try {
			stream =new FileOutputStream("fileIO");
			
			String str = "Hello world";
			byte[] strByte=str.getBytes();
			stream.write(strByte);
			System.out.println("Data written in file");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(stream!=null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
