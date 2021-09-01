package assignment;

public class Medicine {
	private String name;
	private String address;
	
	public Medicine() {
		name="ABCD";
		address="India";
	}
	
	public void displayLabel() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
