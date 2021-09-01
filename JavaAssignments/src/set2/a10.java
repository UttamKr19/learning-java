package set2;

public class a10 {
	static boolean inOrder(int a,int b,int c,boolean bok) {
		if(bok) {
			if(c>b) {
				return true;
			}
			return false;
		}
		else {
			if(b>a && c>b)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(inOrder(1, 2, 4, false));
		System.out.println(inOrder(1, 2, 1, false));
		System.out.println(inOrder(1, 1, 2, true));
	}
}
