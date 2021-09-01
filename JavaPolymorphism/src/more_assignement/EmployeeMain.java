package more_assignement;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp;
		emp=new Manager(30000,1000);
		emp.salary();
		
		emp=new Labour(1000,100);
		emp.salary();
	}
}
