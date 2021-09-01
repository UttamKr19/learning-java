package assignments;

public class Guest_Bill {

	String guestName;
	String month;
	double roomrent;
	double food;
	double discount=0;
	
	
	
	public Guest_Bill(String guestName, String month, double roomrent, double food) {

		this.guestName = guestName;
		this.month = month;
		this.roomrent=roomrent;
		this.food=food;
		
		if(month=="Nov" || month=="Dec" ||month=="Jan" || month=="Feb" || month=="Mar") {
			discount=discount+food*0.2+roomrent*0.5;
		}
		else if(month=="Apr" || month=="May" || month=="Jun" || month=="Jul" || month=="Aug" ) {
			discount=discount+food*0.1+roomrent*0.2;
		}
		else {
			discount=discount+food*0.05+roomrent*0.1;
		}
		
	}
	
	
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public double getRoomrent() {
		return roomrent;
	}
	public void setRoomrent(double roomrent) {
		this.roomrent = roomrent;
	}
	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getFood() {
		return food;
	}
	public void setFood(double food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Guest_Bill [guestName=" + guestName + ", month=" + month + ", roomrent=" + roomrent + ", food=" + food
				+ ", discount=" + discount + "]";
	}
	
	
}
