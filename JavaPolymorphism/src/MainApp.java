
public class MainApp {

	public static void main(String[] args) {
		// upcasting Student to Person
		Person person = new Student("Ram", "Pune", 11, 5, 36, 25, 45);
		System.out.println(person);

//		person.calcAverage --> gives compile time error
//		down casting is needed if u want to work with 
//		same object 'person' instead of creating new 
//		student object for calling calcAverage()
		Student student = (Student) person; // downcasting Person to Student
		student.calcAverage();

		person = new Employee("Ram", "Delhi", 45122, "Manager", 50000);
		Employee emp = (Employee) person;
		emp.calcSalary();
	}

}
