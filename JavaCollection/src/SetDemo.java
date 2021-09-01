import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set;
		
		set = new HashSet<>();
		set.add(299);
		set.add(32);
		set.add(33);
		set.add(45);
		set.add(22);
		set.add(299);
		System.out.println("HashSet:       "+set);
		System.out.println("Size of set: "+set.size());
		System.out.println("Contains 299: "+(set.contains(299)?"Yes":"No"));
		
		Iterator<Integer> itr=set.iterator();
		System.out.println("itr class name: "+itr.getClass().getName());
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		set.clear();
		System.out.println("\nisEmpty: "+(set.isEmpty()?"Yes":"No"));
		
//		set = new LinkedHashSet<>();
//		set.add(299);
//		set.add(32);
//		set.add(33);
//		set.add(45);
//		set.add(22);
//		System.out.println("LinkedHashSet: "+set);
//		
//		set = new TreeSet<>();
//		set.add(299);
//		set.add(32);
//		set.add(33);
//		set.add(45);
//		set.add(22);
//		set.add(299);
//		System.out.println("TreeSet:       "+set);
	}
}
