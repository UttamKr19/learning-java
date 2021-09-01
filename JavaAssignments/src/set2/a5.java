package set2;

public class a5 {
	static boolean duckNumber(int num) {
		String str=""+num;
		if(str.charAt(0)=='0')
			return false;
		for(char c:str.toCharArray()) {
			if(c=='0')
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(duckNumber(40));
		
	}
}
