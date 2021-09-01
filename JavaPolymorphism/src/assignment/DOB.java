package assignment;

public class DOB{
	private int day;
	private String month;
	private int year;
	
	public DOB() {
		
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public DOB(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
}
