import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		BufferedOutputStream stream=null;
		
		try {
			stream=new BufferedOutputStream(new FileOutputStream("bufferIO"));
			String str="This is written using buffer class";
			byte[] b=str.getBytes();
			stream.write(b);
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
