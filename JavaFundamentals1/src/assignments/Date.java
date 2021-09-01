package assignments;

public class Date {
	private int day = 1;
	private int month = 1;
	private int year = 2000;

	public Date() {

	}

	public static boolean isLeapYear(int year) {
		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
	        return true;
	 
	    return false;
	}

	public static boolean isValidYear(int year) {
		if(year<0)
			return false;
		return true;
	}

	public static boolean isValidMonth(int month) {
		if(month>=1 && month<=12) {
			return true;
		}
		return false;
	}

	public static boolean isValidDay(int day,int month,int year) {

		if(month==2) {
			if(isLeapYear(year)) {
				if(!(day>=1 && day<=29)) {
					return false;
				}
			}
			else {
				if(!(day>=1 && day<=28)) {
					return false;
				}
			}
		}
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			if(!(day>=1 && day<=31)) {
				return false;
			}
		}
		
		if(month==4 || month==6 || month==8 || month==9 || month==11) {
			if(!(day>=1 && day<=30)) {
				return false;
			}
		}
		
		return true;
	}

	public Date(int day, int month, int year) {
		
		if (isValidYear(year) && isValidMonth(month) && isValidDay(day,month,year)){
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			System.err.println("invalid date entered");
		}
	}

	
	
//	public Date addDaysToDate(int days) {
//		int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
//		
//		int day=getDay();
//		int month=getMonth();
//		int year=getYear();
//		
//		int newDay=day+days;
//		if(newDay>m[month]) {
//			
//		}
//	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
