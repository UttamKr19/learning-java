
public class ArrayTest {

	public void printArray(String str,int... intArray) {
		System.out.println(str);
		for (int i : intArray) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {

		ArrayTest arrayTest= new ArrayTest();
		
		arrayTest.printArray("abc",1,2,3,4);
		arrayTest.printArray("aa",3,4,4,4);
	}

}
