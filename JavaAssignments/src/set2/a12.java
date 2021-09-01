package set2;

public class a12 {
	static String helperMethod(int n) {
		String ans="";
		if(n%3==0 && n%5==0)
			ans="FizzBuzz";
		else if(n%3==0 && n%5!=0)
			ans="Fizz";
		else if(n%3!=0 && n%5==0)
			ans="Buzz";
		else {
			ans=""+n;
		}
		return ans;
	}
	
	static String[] method(int a,int b) {
		if(a>b) {
			System.out.println("wrong inputs");
			return new String[0];
		}
		String[] ans=new String [b-a];
		int j=0;
		for(int i=a;i<b;i++) {
			ans[j++]=helperMethod(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		String str[]=method(1,11);
		for(String s:str)
			System.out.print(s+" ");
	}
}
