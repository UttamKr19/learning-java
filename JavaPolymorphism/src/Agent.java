
public class Agent {
	public static void main(String[] args) {
		String location = "Ooty";
		Seasons season = Seasons.SPRING;
		MyVacation vacation = new MyVacation(location, season);
		System.out.println(vacation.toString());

		location = "Kanyakumari";
		String whenToGo = "winter";
		season = Seasons.valueOf(whenToGo.toUpperCase());
		MyVacation vacation2 = new MyVacation(location, season);
		System.out.println(vacation2.toString());

		Seasons[] seasons = Seasons.values();
		for (Seasons s : seasons) {
			System.out.println(s);
		}

		switch (season) {
		case WINTER:
			System.out.println("winter switch");
			break;
		case SUMMER:
			System.out.println("summer switch");
			break;

		default:
			break;
		}
	}
}
