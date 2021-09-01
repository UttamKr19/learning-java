package assignment;

public class TestMedicine {
	public static void main(String[] args) {
		Medicine[] med = new Medicine[10];

		int max = 3;
		int min = 1;
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * (max - min + 1) + min);
			switch (r) {
				case 1:
					med[i] = new Tablet();
					break;
				case 2:
					med[i] = new Syrup();
					break;
				case 3:
					med[i] = new Ointment();
					break;
				default:
					break;
			}
		}

		for (Medicine medicine : med) {
			medicine.displayLabel();
		}
	}
}
