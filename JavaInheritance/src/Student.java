
public class Student extends Person {
	private int studId;
	private String subject;
	private int marks;

	public Student(int studId,String subject,int marks,String name,String address,int age) {
		super(name,address,age);
		this.studId=studId;
		this.subject=subject;
		this.marks=marks;
	}
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", subject=" + subject + ", marks=" + marks + ", getAddress()="
				+ getAddress() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
