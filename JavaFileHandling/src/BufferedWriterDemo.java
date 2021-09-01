import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter("bufferIO_2"));
			String str="This is written using bufferedWriter class";
			writer.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
