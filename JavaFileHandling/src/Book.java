import java.io.Serializable;

public class Book implements Serializable {
	private String book_title;
	private String book_publication;
	private int book_cost;
	
	public Book() {
		
	}
	
	
	public Book(String book_title, String book_publication, int book_cost) {

		this.book_title = book_title;
		this.book_publication = book_publication;
		this.book_cost = book_cost;
	}

	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_publication() {
		return book_publication;
	}

	public void setBook_publication(String book_publication) {
		this.book_publication = book_publication;
	}
	public int getBook_cost() {
		return book_cost;
	}
	public void setBook_cost(int book_cost) {
		this.book_cost = book_cost;
	}

	@Override
	public String toString() {
		return "Book [book_title=" + book_title + ", book_publication=" + book_publication + ", book_cost=" + book_cost
				+ "]";
	}
}
