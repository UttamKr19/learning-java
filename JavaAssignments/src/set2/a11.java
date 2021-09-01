package set2;

public class a11 {
	static String method(int n) {
		String ans="";
		if(n%3==0 && n%5==0)
			ans="FizzBuzz";
		else if(n%3==0 && n%5!=0)
			ans="Fizz";
		else if(n%3!=0 && n%5==0)
			ans="Buzz";
		else {
			ans=""+n+"!";
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println(method(30));
	}
}
