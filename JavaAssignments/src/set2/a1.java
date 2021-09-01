package set2;

public class a1 {
	static void method1(String str) {
		if(str.length()%2==0) {
			System.out.println("String length should be odd");
		}
		else if(str.length()<3){
			System.out.println("String length should be at least 3");
		}
		else {
			int n=str.length();
			n=n/2;
			System.out.println(str.substring(n-1,n+2));
		}
	}
	public static void main(String[] args) {
		method1("Candy");
	}
}
