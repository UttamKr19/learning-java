
public class Employee extends Person {
	private int empId;
	private String designation;
	private double basic;
	private double hra;

	public Employee(String name, String address, int empId, String designation, double basic) {
		super(name, address);
		this.empId = empId;
		this.designation = designation;
		this.basic = basic;
	}

	public void calcSalary() {
		if (designation == "Manager") {
			hra = 0.1 * basic;
		} else if (designation == "Officer") {
			hra = 0.12 * basic;
		} else if (designation == "Clerk") {
			hra = 0.05 * basic;
		}

		System.out.println("Salary: " + (basic - hra));
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation + ", basic=" + basic + ", hra=" + hra + "]";
	}

}
