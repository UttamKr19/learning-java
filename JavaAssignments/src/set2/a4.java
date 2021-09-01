package set2;

import java.util.HashSet;

public class a4 {
	static boolean happy_num(long num) {
//		long m = 0;
//		int digit = 0;
//		HashSet<Long> cycle = new HashSet<Long>();
//		while (num != 1 && cycle.add(num)) {
//			m = 0;
//			while (num > 0) {
//				digit = (int) (num % 10);
//				m += digit * digit;
//				num /= 10;
//			}
//			num = m;
//		}
		return num == 1;
	}

	public static void main(String[] args) {
		System.out.println(happy_num(19));
	}
}
