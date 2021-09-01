
public class Employee extends Person{
	private int empId;
	private String designation;
	
	public Employee(int empId,String designation,String name,String address,int age) {
		super(name,address,age);
		this.empId=empId;
		this.designation=designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation + ", getAddress()=" + getAddress()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
