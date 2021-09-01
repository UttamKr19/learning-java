package set2;

public class a2 {
	static String method(String a,String b) {
		String ans="";
		if(a.length()>0) {
			ans=ans+a.charAt(0);
		}else {
			ans=ans+"@";
		}
		
		if(b.length()>0) {
			ans=ans+b.charAt(b.length()-1);
		}else {
			ans=ans+"@";
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		System.out.println(method("yo", "java"));
	}
}
