
public class a5 {
	static void findCommonElements(int[] arr1,int [] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a= {1,4,55,26,5,2,3,15,7};
		int[] b= {3,53,22,6,15};
		findCommonElements(a, b);
	}	
}
