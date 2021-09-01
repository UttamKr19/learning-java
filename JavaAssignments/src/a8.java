
public class a8 {
	static int findDifference(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return max-min;
	}
	public static void main(String[] args) {
		int[] arr= {2,3,63,2,4,242,45,1,1,9};
		System.out.println(findDifference(arr));
	}
}
