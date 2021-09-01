import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacterStreamDemo {
	static void writeFileWriter() {
		FileWriter writer = null;
		try {
			writer = new FileWriter("charIO");
			String str = "hello worldddd";
			writer.write(str);

			System.out.println("string written in charIO file");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static void readFileReader() {
		FileReader reader = null;
		try {
			reader = new FileReader("charIO");
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static void PrintWriterBufferedReader() {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("characteroutput2.txt"));
			outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

	public static void main(String[] args) {

		writeFileWriter();
		readFileReader();

		PrintWriterBufferedReader();

	}
}
