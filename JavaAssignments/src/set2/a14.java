package set2;

public class a14 {
	static boolean makeBricks(int small,int large,int goal) {
		if(small+(large*5)>=goal) 
			return true;
		return false;
	}
	public static void main(String[] args) {
		boolean isPossible=makeBricks(3, 2, 10);
		System.out.println(isPossible?"Possible":"Not possible");
	}
}
