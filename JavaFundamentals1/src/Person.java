
public class Person {
	private String name;
	private int age;
	private boolean isHuman;
	
	public Person() {
		System.out.println("constructor...");
	}
	
	
	
	public boolean isHuman() {
		return isHuman;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setHuman(boolean isHuman) {
		this.isHuman = isHuman;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
