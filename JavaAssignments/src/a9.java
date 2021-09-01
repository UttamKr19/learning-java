
public class a9 {
	static boolean checkTensSums(int[] arr) {
		int sum=0;
		for(int i:arr) {
			if(i==10) {
				sum+=i;
			}
		}
		if(sum==30)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {2,3,63,20,4,242,45,10,10,9};
		System.out.println(checkTensSums(arr));
	}
}
