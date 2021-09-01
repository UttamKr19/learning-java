
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
			System.out.println("\n----------");
			System.out.println("Title: "+book.getBook_title());
			System.out.println("Publication: "+book.getBook_publication());
			System.out.println("Cost: "+book.getBook_cost());
		}
	}
	
	public static void main(String[] args) {
		
		Book[] books=new Book[3];
		books[0]=new Book("Harry Potter", "Pub1", 888);
		books[1]=new Book("Harry", "Pub2", 788);
		books[2]=new Book("Potter", "Pub3", 988);
		
		for (Book book : books) {
			System.out.println(book.toString());
		}
		
		System.out.println();
		
		Book b1=new Book("Harry Potter", "Pub1", 888);
		Book b2=new Book("Harry", "Pub2", 788);
		Book b3=new Book("Potter", "Pub3", 988);
		displayBook(b1,b2,b3);
		
		
		
//		BookMain ob=new BookMain();
//		Book newBook=new Book("Harry Potter", "Pub1", 888);
//		ob.displayBook(newBook);
	}

}
