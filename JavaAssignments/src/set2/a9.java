package set2;

public class a9 {
	static boolean method(int a,int b,int c) {
		if(a+b==c || b+c==a || c+a==b)
				return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(method(2, 6, 4));
	}
}
