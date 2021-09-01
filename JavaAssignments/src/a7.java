
public class a7 {
	static int[] moveZeroToEnd(int[] arr) {
		int[] newArr=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				newArr[j++]=arr[i];
			}
		}
		
		for(int i=j;i<newArr.length;i++) {
			newArr[i]=0;
		}
		
		return newArr;
	}
	public static void main(String[] args) {
		int[] arr= {1,0,4,20,4,0,32,0,5,0};
		int[] brr=moveZeroToEnd(arr);
		
		for(int i:brr) {
			System.out.println(i);
		}
	}
}
