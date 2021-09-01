
public class a11 {
	static void findNoOfIntegers(int x,int y,int p) {
		if(x<=y) {
			int n=0;
			for(int i=x;i<=y;i++) {
				if(i%p==0)
					n++;
			}
			System.out.println(n);
		}
		else {
			System.out.println("first argument should be lesser than second one");
		}
		
	}
	public static void main(String[] args) {
		findNoOfIntegers(2, 25, 3);
	}
}
