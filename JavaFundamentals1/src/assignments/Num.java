package assignments;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		sc.close();

	}

}
