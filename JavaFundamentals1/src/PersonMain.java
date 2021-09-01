
public class PersonMain {

	public static void main(String[] args) {
		Person person1=new Person();
		
		System.out.println("Name: " +person1.getName());
		System.out.println("Age:" +person1.getAge());
		System.out.println("isHuman: "+person1.isHuman());
		
		person1.setName("Ram");
		person1.setAge(39);
		System.out.println("Name: " +person1.getName());
		System.out.println("Age:" +person1.getAge());
		
	}
}
