package set2;

public class a13 {
	static boolean method(int[] arr) {
		if(arr.length==1)
			return true;
		if(arr.length>1) {
			if(arr[0]==arr[arr.length-1])
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {1,3,43,2,2,34,2};
		System.out.println(method(arr));
	}
}
