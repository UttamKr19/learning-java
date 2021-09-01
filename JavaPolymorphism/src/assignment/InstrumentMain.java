package assignment;

public class InstrumentMain {
	public static void main(String[] args) {
		Instrument[] instrument = new Instrument[10];
		int max = 3;
		int min = 1;
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * (max - min + 1) + min);
			switch (r) {
			case 1:
				instrument[i] = new Piano();
				instrument[i].play();
				break;
			case 2:
				instrument[i] = new Flute();
				instrument[i].play();
				break;
			case 3:
				instrument[i] = new Guitar();
				instrument[i].play();
				break;
			default:
				break;
			}

			
		}
		
		for (Instrument instrument2 : instrument) {
			if (instrument2 instanceof Piano) {
				System.out.println("piano instance");
			} else if (instrument2 instanceof Flute) {
				System.out.println("flute instance");
			} else {
				System.out.println("guitar instance");
			}
		}
	}
}
