
public class MyVacation {
	private String location;
	private Seasons season;
	
	public MyVacation(String location,Seasons season) {
		this.location=location;
		this.season=season;
	}

	@Override
	public String toString() {
		return "MyVacation [location=" + location + ", season=" + season + "]";
	}
	
}
