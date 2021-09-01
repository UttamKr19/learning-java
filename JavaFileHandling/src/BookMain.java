import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookMain {

	Book createBook(String title,String publication,int cost) {
		Book b=new Book();
		b.setBook_title(title);
		b.setBook_publication(publication);
		b.setBook_cost(cost);
		return b;
	}
	
	static void displayBook(Book... books) {
		
		for (Book book : books) {
			System.out.println("-------------------------");
			System.out.println("Title: "+book.getBook_title());
			System.out.println("Publication: "+book.getBook_publication());
			System.out.println("Cost: "+book.getBook_cost());
		}
	}
		
	static void writeIntoFile(Book[] books) {
		ObjectOutputStream stream=null;
		try {
			stream= new ObjectOutputStream(new FileOutputStream("bookIO"));
			
			stream.writeObject(books);
			System.out.println("books object written in file");
			
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
	
	static void readFromFile() {
		ObjectInputStream stream = null;
		try {
			stream = new ObjectInputStream(new FileInputStream("bookIO"));

			Book[] books=(Book[])stream.readObject();
			displayBook(books);

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
	
	public static void main(String[] args) {
		
		Book[] books=new Book[3];
		books[0]=new Book("Harry Potter", "Pub1", 888);
		books[1]=new Book("Harry", "Pub2", 788);
		books[2]=new Book("Potter", "Pub3", 9880);
		
		writeIntoFile(books);
		readFromFile();

	}

}
