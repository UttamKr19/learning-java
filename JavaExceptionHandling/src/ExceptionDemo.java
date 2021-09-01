
public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		try {
			int c=a/b;
			System.out.println(c);
			
			String str="hell";
			System.out.println(str.charAt(2));
			
			int[] arr= {1,2,3,4,5};
			System.out.println(arr[20]);
			
		} catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		} finally {
			System.out.println("finally");
			
		}
		
		
	}
}
