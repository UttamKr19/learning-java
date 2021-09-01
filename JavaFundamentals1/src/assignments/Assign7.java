package assignments;

public class Assign7 {
	public static void main(String[] args) {
		int first=Integer.parseInt(args[0]);
		int second=Integer.parseInt(args[1]);
		
		System.out.println(first+" "+second);
		
		for(int i=0;i<13;i++) {
			System.out.print(first+second+" ");
			int t=second;
			second=first+second;
			first=t;
		}
		
		
	}
}
