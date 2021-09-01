package set2;

import java.util.Set;
import java.util.TreeSet;

public class a18 {
	static boolean isEvenlySpaced(int a,int b,int c) {
		Set<Integer> set=new TreeSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		if(set.size()==2)
			return false;
		
		if((b-a)==(c-b))
			return true;
		
		return false;
	}
	public static void main(String[] args) {
			System.out.println("isEvenlySpaced: "+(isEvenlySpaced(2,6,10)?"Yes":"No"));
	}
}
