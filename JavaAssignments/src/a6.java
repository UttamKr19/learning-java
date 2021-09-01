
public class a6 {
	static void findPair(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length && j != i; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,4,23,5,3,42,6,40};
		findPair(arr, 45);
	}
}
