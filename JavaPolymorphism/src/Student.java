
public class Student extends Person {
	private int rollNo;
	private int std;
	private int marks_1;
	private int marks_2;
	private int marks_3;

	public Student(String name, String address, int rollNo, int std, int marks_1, int marks_2, int marks_3) {
		super(name, address);
		this.rollNo = rollNo;
		this.std = std;
		this.marks_1 = marks_1;
		this.marks_2 = marks_2;
		this.marks_3 = marks_3;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", std=" + std + ", marks_1=" + marks_1 + ", marks_2=" + marks_2
				+ ", marks_3=" + marks_3 + ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}

	public void calcAverage() {
		int total = marks_1 + marks_2 + marks_3;
		float avg = total / 3;
		System.out.println("Average: " + avg);
	}

}
