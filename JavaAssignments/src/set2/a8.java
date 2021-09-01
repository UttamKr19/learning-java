package set2;

public class a8 {
	static int party(int tea,int candy) {

		if(tea>=5 && candy>=5) {
			if(tea>=2*candy || candy>=2*tea)
				return 2;
			else
				return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		int partyValue=party(15, 6);
		if(partyValue==0) {
			System.out.println("Party is bad");
		}
		else if(partyValue==1) {
			System.out.println("Party is good");
		}
		else {
			System.out.println("Party is great");
		}
	}
}
