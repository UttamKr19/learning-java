package assignment;

public class TestCompartment {
	public static void main(String[] args) {
		Compartment[] comp = new Compartment[10];
		int max = 4;
		int min = 1;
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * (max - min + 1) + min);
			switch (r) {
			case 1:
				comp[i]=new FirstClass();
				break;
			case 2:
				comp[i]=new Ladies();
				break;
			case 3:
				comp[i]=new General();
				break;
			case 4:
				comp[i]=new Luggage();
				break;
			default:
				break;
			}
		}

		
		for (Compartment compartment : comp) {
			compartment.notice();
		}
	}
}
