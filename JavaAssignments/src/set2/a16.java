package set2;

import java.util.HashSet;
import java.util.Set;

public class a16 {
	public static void main(String[] args) {
		int a=12;
		int b=23;
		int c=12;
		Set<Integer> set =new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		int sum=0;
		for (Integer i : set) {
			sum+=i;
		}
		System.out.println("Sum: "+sum);
	}
}
