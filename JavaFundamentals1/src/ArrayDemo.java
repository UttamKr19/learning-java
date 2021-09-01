import java.util.Iterator;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] marks; //declaration
		marks=new int[3]; //initialization
		System.out.println(marks[0]+" "+marks[1]+" "+marks[2]);
		
		marks[0]=33;
		marks[1]=55;
		marks[2]=99;
		System.out.println(marks[0]+" "+marks[1]+" "+marks[2]);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		for(int i:marks) {
			System.out.println(i);
		}
		
		
	}
}
