
public class PersonArray {
	public static void main(String[] args) {
		Person person1;// reference of a class default value is null
		person1=new Person();
		
		Person[] persons=new Person[3];
		persons[0]=new Person("abc",33);
		persons[1]=new Person("xyz",43);
		persons[2]=new Person("pqr",93);
		
		for(Person p:persons) {
			System.out.println(p.toString());
		}
	}
}
