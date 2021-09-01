package assignments;

public class CommandLineString {
	static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
	
	public static void main(String[] args) {
		String fname=args[0];
		
		System.out.println(fname);
		System.out.println(fname.length());
		System.out.println(fname.toUpperCase());
		
		System.out.println("Palindrome: "+isPalindrome(fname));
		
	}
}
