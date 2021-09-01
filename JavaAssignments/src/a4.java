
public class a4 {
	static void increasingDecreasing(int a,int b,int c) {
		if(a>b && b>c) {
			System.out.println("Decreasing");
		}
		else if(c>b && b>a) {
			System.out.println("Increasing");
		}
		else {
			System.out.println("neither");
		}
	}
	public static void main(String[] args) {
		increasingDecreasing(1, 4, 7);
	}
}
