package set2;

public class a15 {
	static int method(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		}

		if (21 -a > 21-b) {
			return b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		System.out.println(method(12,34));
	}
}
