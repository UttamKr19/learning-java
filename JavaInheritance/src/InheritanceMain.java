
public class InheritanceMain {

	public static void main(String[] args) {

		Person person=new Person("Ram","Pune",33);
//		person.setName("Ram");
//		person.setAddress("Pune");
//		person.setAge(33);
		System.out.println("Name: "+person.getName());
		System.out.println("Age: "+person.getAge());
		System.out.println("Address: "+person.getAddress());
		
		System.out.println("----------------------");
		
		Employee emp=new Employee(100,"ASE","Shyam","Mumbai",22);
//		emp.setEmpId(100);
//		emp.setName("Shyam");
//		emp.setDesignation("ASE");
//		emp.setAddress("Mumbai");
//		emp.setAge(22);
		System.out.println(emp.toString());
		
		System.out.println("----------------------");
		
		Student stud=new Student(253,"Maths",90,"Gita","Delhi",21);
//		stud.setStudId(2536);
//		stud.setName("Gita");
//		stud.setSubject("Maths");
//		stud.setAddress("Delhi");
//		stud.setAge(21);
//		stud.setMarks(90);
		System.out.println(stud.toString());
	}

}
