
public class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
