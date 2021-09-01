package set2;

public class a3 {
	static boolean isUglyNumber(int n) {
		if(n<=0)
			return false;
		
		while (n != 1) {
			if (n % 5 == 0) {
				n /= 5;
			} else if (n % 3 == 0) {
				n /= 3;
			} else if (n % 2 == 0) {
				n /= 2;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isUglyNumber(7));
	}
}
