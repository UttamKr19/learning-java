package assignments;

public class Employee {

	private static int empNumber;
	private String empName;
	private Date doj;

	public Employee() {
		
	}
	public Employee(String empName, Date doj) {
		empNumber++;
		this.empName = empName;
		this.doj = doj;
	}

	public void displayEmployee() {
		System.out.println("Number: " + empNumber + "\n" + "Name: " + empName + "\n" + "DOJ: " + doj.getDay() + "/"
				+ doj.getMonth() + "/" + doj.getYear());
	}

	public static void main(String[] args) {
		Date date = new Date();
		Employee e1 = new Employee("Uttam", date);
		e1.displayEmployee();

		System.out.println();

		Date date2 = new Date(12, 10, 1999);
		Employee e2 = new Employee("Kumar", date2);
		e2.displayEmployee();

		System.out.println();

		Date date3 = new Date(52, 10, 1852);
		Employee e3 = new Employee("Uttam Kumar", date3);
		e3.displayEmployee();
	}

}
