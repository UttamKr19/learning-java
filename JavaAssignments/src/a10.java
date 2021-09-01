import java.util.HashSet;

public class a10 {
	static int findLengthOfUniqueElements(int arr[]) {
		HashSet set=new HashSet();
		for(int i:arr)
			set.add(i);
		return set.size();
	}
	public static void main(String[] args) {
		int[] arr= {2,3,63,20,4,242,45,10,10,9};
		System.out.println(findLengthOfUniqueElements(arr));
	}
}
