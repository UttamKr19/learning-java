import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// add elements
		System.out.println("size " + list.size() + " " + list);
		list.add(34);
		list.add(new Integer(22)); // till jdk 1.4, boxing
		list.add(90); // jkd 1.5+, auto-boxing
		list.add(34);
		System.out.println("size " + list.size() + " " + list);

		// insert element
		list.add(2, 45); // adding 45 at index 2
		System.out.println("size " + list.size() + " " + list);

		// search element
		System.out.println("List contains 45? "+ (list.contains(45)?"Yes":"No"));
		
		//remove element
		list.remove(1);
		list.remove((Object)45);
		System.out.println("size " + list.size() + " " + list);

		//iteration
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println("");
		for (Integer i : list) {
			System.out.print(i +" ");
		}
		System.out.println();
		Iterator<Integer> itr=list.iterator();
		System.out.println(itr.getClass().getName());
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
