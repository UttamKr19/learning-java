package assignment;

public class Person extends DOB{
	public static int id;
	public int person_ID;			
	public String person_Name;		
	public long person_Telephone;
	public DOB person_DOB;
	
	public Person(String person_Name, long person_Telephone,DOB dob) {
		super(dob.getDay(),dob.getMonth(),dob.getYear());
		this.person_ID=id; id++;
		this.person_Name = person_Name;
		this.person_Telephone = person_Telephone;
		this.person_DOB=dob;
	}

	@Override
	public String toString() {
		return "Person [person_Name=" + person_Name + ", person_Telephone=" + person_Telephone + ", getDay()="
				+ getDay() + ", getYear()=" + getYear() + ", getMonth()=" + getMonth() + "]";
	}

	

	

	public int getPerson_ID() {
		return person_ID;
	}

	public void setPerson_ID(int person_ID) {
		this.person_ID = person_ID;
	}

	public String getPerson_Name() {
		return person_Name;
	}

	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}

	public long getPerson_Telephone() {
		return person_Telephone;
	}

	public void setPerson_Telephone(long person_Telephone) {
		this.person_Telephone = person_Telephone;
	}

	public DOB getPerson_DOB() {
		return person_DOB;
	}

	public void setPerson_DOB(DOB person_DOB) {
		this.person_DOB = person_DOB;
	}
	
	
}
